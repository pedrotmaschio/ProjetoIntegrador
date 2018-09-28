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

public class LocacaoDAO {
    Connection con;
    public LocacaoDAO(){
        con = ConnectionDAO.getConnection();
    }
    
    public void Locar(int idAdmin){
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM t_admin, t_locatario, t_veiculo WHERE t_admin.id = ? AND t_veiculo.idAdmin = ? AND t_locatario.idAdmin = ?;");
            stmt.setInt(1, idAdmin);
            stmt.setInt(2, idAdmin);
            stmt.setInt(3, idAdmin);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                
            }
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
