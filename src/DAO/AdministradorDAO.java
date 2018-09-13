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

/**
 *
 * @author Pedro Maschio
 */
public class AdministradorDAO {
    Connection conn;
    public AdministradorDAO(){
        conn = ConnectionDAO.getConnection();
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
