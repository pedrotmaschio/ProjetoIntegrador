/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Pedro Maschio
 */
import java.sql.Connection;
import Model.Administrador;
import Model.Locatario;
import Model.Veiculo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Model.Locacao;

public class LocacaoDAO {
    Connection con;
    public LocacaoDAO(){
        con = ConnectionDAO.getConnection();
    }
    
    public Locacao Locar(int idVeiculo){
        Locacao a = new Locacao();
        try {
        PreparedStatement stmt = con.prepareStatement("UPDATE t_veiculo SET locado=1 WHERE id=?;");
        stmt.setInt(1, idVeiculo);
        stmt.executeUpdate();
        
        //stmt.close();
        stmt.close();
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return a;
    }
    
    public void Devolver(int id){
        try {
            PreparedStatement stmt = con.prepareStatement("UPDATE t_veiculo SET locado=0 WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
