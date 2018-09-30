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
    
    public Locacao Locar(int idAdmin, int idVeiculo, String dataSaida, String dataDevo, String horarioSaida){
        Locacao a = new Locacao();
        try {
            String sql = "SELECT \n" +
"    t_admin.companhia,\n" +
"    t_admin.cnpj,\n" +
"    t_admin.enderecoCompanhia,\n" +
"    t_admin.email as emailAdmin,\n" +
"    t_locatario.nomeCompleto as nomeLocatario,\n" +
"    t_locatario.dataNasc,\n" +
"    t_locatario.cnh,\n" +
"    t_locatario.email AS emailLocatario,\n" +
"    t_locatario.cpf,\n" +
"    t_locatario.telefone,\n" +
"    t_locatario.endereco,\n" +
"    t_veiculo.marca,\n" +
"    t_veiculo.modelo,\n" +
"    t_veiculo.cor,\n" +
"    t_veiculo.anoLancamento,\n" +
"    t_veiculo.capacidadeTanque,\n" +
"    t_veiculo.tipoCombustivel,\n" +
"    t_veiculo.quantCombustivel\n" +
"FROM\n" +
"    t_admin, t_locatario, t_veiculo \n" +
"WHERE\n" +
"	t_admin.id = ? AND t_locatario.idAdmin = ? AND t_veiculo.id = ? AND t_veiculo.idAdmin = ?;";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, idAdmin);
        stmt.setInt(2, idAdmin);   
        stmt.setInt(3, idVeiculo);
        stmt.setInt(4, idAdmin);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            a.setCapaciTanque(rs.getDouble("capacidadeTanque"));
            a.setCnhLocatario(rs.getString("cnh"));
            a.setCnpjLocadora(rs.getString("cnpj"));
            a.setCor(rs.getString("cor"));
            a.setCpfLocatario(rs.getString("cpf"));
            a.setDataDevolucao(dataDevo);
            a.setDataSaida(dataSaida);
            a.setEmailLocadora(rs.getString("emailAdmin"));
            a.setEmailLocatario(rs.getString("emailLocatario"));
            a.setEnderecoLocadora(rs.getString("enderecoCompanhia"));
            a.setHorarioSaida(horarioSaida);
            a.setMarca(rs.getString("marca"));
            a.setModelo(rs.getString("modelo"));
            a.setNascLocatario(rs.getString("dataNasc"));
            a.setNomeLocadora(rs.getString("companhia"));
            a.setNomeLocatario(rs.getString("nomeLocatario"));
            a.setQuantTanque(rs.getDouble("quantCombustivel"));
            a.setTelefoneLocatario(rs.getString("telefone"));
            a.setTipoComb(rs.getString("tipoCombustivel"));
        }
        
        PreparedStatement stmt2 = con.prepareStatement("UPDATE t_veiculo SET locado=1 WHERE id=?;");
        stmt2.setInt(1, idVeiculo);
        stmt2.executeUpdate();
        
        stmt.close();
        stmt2.close();
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
        return a;
    }
}
