/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import Model.Locatario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Pedro Maschio
 */
public class LocatarioDAO {
    Connection conn = null;
    
    public LocatarioDAO(){
        conn = ConnectionDAO.getConnection();
    }
    
    public void create(Locatario l){
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO t_locatario(idAdmin, nomeCompleto, dataNasc, cnh, endereco, email, telefone, cpf, cidade, bairro, numero) VALUES(?,?,?,?,?,?,?,?,?,?,?);");
            stmt.setInt(1, l.getIdAdmin());
            stmt.setString(2, l.getNomeCompleto());
            stmt.setString(3, l.getNascimento());
            stmt.setString(4, l.getCnh());
            stmt.setString(5, l.getEndereco());
            stmt.setString(6, l.getEmail());
            stmt.setString(7, l.getTelefone());
            stmt.setString(8, l.getCpf());
            stmt.setString(9, l.getCidade());
            stmt.setString(10, l.getBairro());
            stmt.setString(11, l.getNumero());
            stmt.executeUpdate();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Locatário Cadastrado com Sucesso!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
            throw new RuntimeException(ex);
        }
    }
    public List<Locatario> buscar(String nome, int idAdmin){
        List<Locatario> locatarios = new ArrayList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM t_locatario WHERE nomeCompleto LIKE ? AND t_locatario.idAdmin = ?;");
            stmt.setString(1, nome+"%");
            stmt.setInt(2, idAdmin);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Locatario locatario = new Locatario();
                locatario.setCnh(rs.getString("cnh"));
                locatario.setIdAdmin(rs.getInt("idAdmin"));
                locatario.setEmail(rs.getString("email"));
                locatario.setEndereco(rs.getString("endereco"));
                locatario.setNascimento(rs.getString("dataNasc"));
                locatario.setNomeCompleto(rs.getString("nomeCompleto"));
                locatario.setTelefone(rs.getString("telefone"));
                locatario.setCidade(rs.getString("cidade"));
                locatario.setBairro(rs.getString("bairro"));
                locatario.setNumero(rs.getString("numero"));
                locatario.setId(rs.getInt("id"));
                locatario.setCpf(rs.getString("cpf"));
                locatarios.add(locatario);
            }
            stmt.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar locatário!");
            throw new RuntimeException(ex);
        }
        return locatarios;
    }
    
       public Locatario buscar(int id, int idAdmin){
        Locatario l = new Locatario();
        try {    
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM t_locatario WHERE id = ? AND t_locatario.idAdmin = ? ORDER BY nomeCompleto;");
            stmt.setInt(1, id);  
            stmt.setInt(2, idAdmin);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                l.setCnh(rs.getString("cnh"));
                l.setIdAdmin(rs.getInt("idAdmin"));
                l.setEmail(rs.getString("email"));
                l.setEndereco(rs.getString("endereco"));
                l.setNascimento(rs.getString("dataNasc"));
                l.setNomeCompleto(rs.getString("nomeCompleto"));
                l.setCidade(rs.getString("cidade"));
                l.setBairro(rs.getString("bairro"));
                l.setNumero(rs.getString("numero"));
                l.setTelefone(rs.getString("telefone"));
                l.setId(rs.getInt("id"));
                l.setCpf(rs.getString("cpf"));
             }
             stmt.close();
         } catch(Exception ex){
             JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
             throw new RuntimeException(ex);
         }
         return l;
    }
    public void excluir(int id, int idAdmin){
        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM t_locatario WHERE id=? AND t_locatario.idAdmin = ?;");
            stmt.setInt(1, id);
            stmt.setInt(2, idAdmin);
            
            stmt.executeUpdate();
            stmt.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o locatário!");
            throw new RuntimeException(ex);
        }
    }
       public void editar(Locatario l){
        try {
            
            PreparedStatement stmt = conn.prepareStatement("UPDATE t_locatario SET nomeCompleto=?,dataNasc=?,cnh=?,endereco=?,email=?,cpf=?,telefone=?,cidade=?,bairro=?,numero=? WHERE id=? AND t_locatario.idAdmin = ?;");
            stmt.setString(1, l.getNomeCompleto());
            stmt.setString(2, l.getNascimento());
            stmt.setString(3, l.getCnh());
            stmt.setString(4, l.getEndereco());
            stmt.setString(5, l.getEmail());
            stmt.setString(6, l.getCpf());
            stmt.setString(7, l.getTelefone());
            stmt.setString(8, l.getCidade());
            stmt.setString(9, l.getBairro());
            stmt.setString(10, l.getNumero());
            stmt.setInt(11, l.getId());
            stmt.setInt(12, l.getIdAdmin());
            stmt.executeUpdate();
            stmt.close();

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao editar veículo!");
            throw new RuntimeException(ex);
        }
    }
    public boolean buscaCPF(String cpf){
        boolean retorno = false;
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT cpf FROM t_locatario WHERE cpf=?;");
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
                retorno = true;
            else {
                retorno = false;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
            throw new RuntimeException(ex);   
        }
        return retorno;
    }       
}
