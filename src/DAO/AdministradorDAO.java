/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Model.Administrador;

/**
 *
 * @author Pedro Maschio
 */
public class AdministradorDAO {
    Connection conn;
    public AdministradorDAO(){
        conn = ConnectionDAO.getConnection();
    }
    public void cadastro(Administrador a){
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO t_admin(nomeCompleto, cnpj, dataNasc, companhia, enderecoCompanhia, email, senha) VALUES(?,?,?,?,?,?,?);");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getCNPJ());
            stmt.setString(3, a.getNascimento());
            stmt.setString(4, a.getNomeCompanhia());
            stmt.setString(5, a.getEnderecoCompanhia());
            stmt.setString(6, a.getEmail());
            stmt.setString(7, a.getSenha());
            stmt.execute();
            stmt.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Administrador!");
            throw new RuntimeException(ex);
        }
    }
    public boolean buscaEmail(String email){
        boolean retorno = false;
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT email FROM t_admin WHERE email=?;");
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
                retorno = true;
            else {
                retorno = false;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao logar!");
        }
        return retorno;
    }

   public boolean buscaSenha(String senha){
        boolean retorno = false;
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT senha FROM t_admin WHERE senha=?;");
            stmt.setString(1, senha);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
                retorno = true;
            else {
                retorno = false;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao logar!");
        }
        return retorno;
    }
}
