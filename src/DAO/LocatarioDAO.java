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
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO t_locatario(nomeCompleto, dataNasc, cnh, endereco, email, telefone, cpf) VALUES(?,?,?,?,?,?,?);");
            stmt.setString(1, l.getNomeCompleto());
            stmt.setString(2, l.getNascimento());
            stmt.setString(3, l.getCnh());
            stmt.setString(4, l.getEndereco());
            stmt.setString(5, l.getEmail());
            stmt.setString(6, l.getTelefone());
            stmt.setString(7, l.getCpf());
            stmt.executeUpdate();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Locatário Cadastrado com Sucesso!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
            throw new RuntimeException(ex);
        }
    }
    public List<Locatario> buscar(String nome){
        List<Locatario> locatarios = new ArrayList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM t_locatario WHERE nomeCompleto LIKE ?;");
            stmt.setString(1, nome+"%");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Locatario locatario = new Locatario();
                locatario.setCnh(rs.getString("cnh"));
                locatario.setEmail(rs.getString("email"));
                locatario.setEndereco(rs.getString("endereco"));
                locatario.setNascimento(rs.getString("dataNasc"));
                locatario.setNomeCompleto(rs.getString("nomeCompleto"));
                locatario.setTelefone(rs.getString("telefone"));
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
    
       public Locatario buscar(int id){
        Locatario l = new Locatario();
        try {    
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM t_locatario WHERE id = ?;");
            stmt.setInt(1, id);  
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                l.setCnh(rs.getString("cnh"));
                l.setEmail(rs.getString("email"));
                l.setEndereco(rs.getString("endereco"));
                l.setNascimento(rs.getString("dataNasc"));
                l.setNomeCompleto(rs.getString("nomeCompleto"));
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
    public void excluir(int id){
        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM t_locatario WHERE id=?;");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o locatário!");
            throw new RuntimeException(ex);
        }
    }
       public void editar(Locatario l){
        try {
            
            PreparedStatement stmt = conn.prepareStatement("UPDATE t_locatario SET nomeCompleto=?,dataNasc=?,cnh=?,endereco=?,email=?,cpf=?,telefone=? WHERE id=?;");
            stmt.setString(1, l.getNomeCompleto());
            stmt.setString(2, l.getNascimento());
            stmt.setString(3, l.getCnh());
            stmt.setString(4, l.getEndereco());
            stmt.setString(5, l.getEmail());
            stmt.setString(6, l.getCpf());
            stmt.setString(7, l.getTelefone());
            stmt.setInt(8, l.getId());
            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Veículo editado com sucesso!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao editar veículo!");
            throw new RuntimeException(ex);
        }
    }
}
