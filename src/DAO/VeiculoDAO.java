/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import DAO.ConnectionDAO;
import Model.Veiculo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
/**
 *
 * @author Pedro Maschio
 */
public class VeiculoDAO {
    Connection conn= null;
    
    public VeiculoDAO(){
        conn = ConnectionDAO.getConnection();
    }
    
    public void create(Veiculo v) {
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO t_veiculo(idAdmin, marca, modelo, placa, cor, anoLancamento, anoAquisicao, capacidadeTanque, tipoCombustivel, quantCombustivel, acessorios, observacao, locado) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);");
            stmt.setInt(1, v.getIdAdmin());
            stmt.setString(2, v.getMarca());
            stmt.setString(3, v.getModelo());
            stmt.setString(4, v.getPlaca());
            stmt.setString(5, v.getCor());
            stmt.setInt(6, v.getAnoLancamento());
            stmt.setInt(7, v.getAnoAquisicao());
            stmt.setDouble(8,v.getCapacidadeTanque());
            stmt.setString(9, v.getTipoComb());
            stmt.setDouble(10, v.getQuantComb());
            stmt.setString(11, v.getAcessorios());
            stmt.setString(12, v.getObservacao());
            stmt.setBoolean(13, v.isLocado());
            stmt.executeUpdate();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Veículo Cadastrado com Sucesso!");
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar o veículo!");
            throw new RuntimeException(ex);
        }
    }
    public List<Veiculo> buscar(int valor, String busca, boolean locado, int idAdmin){
         List<Veiculo> veiculos = new ArrayList<>();
         try {
            if(valor ==0){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM t_veiculo WHERE marca LIKE ? AND locado=? AND t_veiculo.idAdmin = ?;");
                stmt.setString(1, busca+"%");  
                stmt.setBoolean(2, locado);
                stmt.setInt(3, idAdmin);
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    Veiculo v = new Veiculo();
                    v.setId(rs.getInt("id"));
                    v.setIdAdmin(rs.getInt("idAdmin"));
                    v.setMarca(rs.getString("marca"));
                    v.setModelo(rs.getString("modelo"));
                    v.setPlaca(rs.getString("placa"));
                    v.setCor(rs.getString("cor"));
                    v.setAnoLancamento(rs.getInt("anoLancamento"));
                    v.setAnoAquisicao(rs.getInt("anoAquisicao"));
                    v.setCapacidadeTanque(rs.getDouble("capacidadeTanque"));
                    v.setTipoComb(rs.getString("tipoCombustivel"));
                    v.setQuantComb(rs.getDouble("quantCombustivel"));
                    v.setAcessorios(rs.getString("acessorios"));
                    v.setObservacao(rs.getString("observacao"));
                 
                    veiculos.add(v);
             }
             stmt.close();
            } else if(valor == 1){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM t_veiculo WHERE modelo LIKE ? AND locado=? AND t_veiculo.idAdmin = ?;");
                stmt.setString(1, busca+"%");
                stmt.setBoolean(2, locado);
                stmt.setInt(3, idAdmin);
                
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    Veiculo v = new Veiculo();
                    v.setId(rs.getInt("id"));
                    v.setIdAdmin(rs.getInt("idAdmin"));
                    v.setMarca(rs.getString("marca"));
                    v.setModelo(rs.getString("modelo"));
                    v.setPlaca(rs.getString("placa"));
                    v.setCor(rs.getString("cor"));
                    v.setAnoLancamento(rs.getInt("anoLancamento"));
                    v.setAnoAquisicao(rs.getInt("anoAquisicao"));
                    v.setCapacidadeTanque(rs.getDouble("capacidadeTanque"));
                    v.setTipoComb(rs.getString("tipoCombustivel"));
                    v.setQuantComb(rs.getDouble("quantCombustivel"));
                    v.setAcessorios(rs.getString("acessorios"));
                    v.setObservacao(rs.getString("observacao"));
                 
                    veiculos.add(v);
             }
             stmt.close();
            }else if(valor == 2){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM t_veiculo WHERE cor LIKE ? AND locado=? AND t_veiculo.idAdmin = ?;");
                stmt.setString(1, busca+"%"); 
                stmt.setBoolean(2, locado);
                stmt.setInt(3, idAdmin);
                
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    Veiculo v = new Veiculo();
                    v.setId(rs.getInt("id"));
                    v.setIdAdmin(rs.getInt("idAdmin"));
                    v.setMarca(rs.getString("marca"));
                    v.setModelo(rs.getString("modelo"));
                    v.setPlaca(rs.getString("placa"));
                    v.setCor(rs.getString("cor"));
                    v.setAnoLancamento(rs.getInt("anoLancamento"));
                    v.setAnoAquisicao(rs.getInt("anoAquisicao"));
                    v.setCapacidadeTanque(rs.getDouble("capacidadeTanque"));
                    v.setTipoComb(rs.getString("tipoCombustivel"));
                    v.setQuantComb(rs.getDouble("quantCombustivel"));
                    v.setAcessorios(rs.getString("acessorios"));
                    v.setObservacao(rs.getString("observacao"));
                 
                    veiculos.add(v);
             }
             stmt.close();
            }else if(valor == 3){
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM t_veiculo WHERE anoLancamento LIKE ? AND locado=? AND t_veiculo.idAdmin = ?;");
                stmt.setString(1, busca+"%");
                stmt.setBoolean(2, locado);
                stmt.setInt(3, idAdmin);
                
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    Veiculo v = new Veiculo();
                    v.setId(rs.getInt("id"));
                    v.setIdAdmin(rs.getInt("idAdmin"));
                    v.setMarca(rs.getString("marca"));
                    v.setModelo(rs.getString("modelo"));
                    v.setPlaca(rs.getString("placa"));
                    v.setCor(rs.getString("cor"));
                    v.setAnoLancamento(rs.getInt("anoLancamento"));
                    v.setAnoAquisicao(rs.getInt("anoAquisicao"));
                    v.setCapacidadeTanque(rs.getDouble("capacidadeTanque"));
                    v.setTipoComb(rs.getString("tipoCombustivel"));
                    v.setQuantComb(rs.getDouble("quantCombustivel"));
                    v.setAcessorios(rs.getString("acessorios"));
                    v.setObservacao(rs.getString("observacao"));
                 
                    veiculos.add(v);
             }
             stmt.close();
            }
         } catch(Exception ex){
             JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar veículos!");
             throw new RuntimeException(ex);
         }
         return veiculos;
    }
    
    
    public Veiculo buscar(int id){
        Veiculo v = new Veiculo();
        try {    
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM t_veiculo WHERE id = ?;");
            stmt.setInt(1, id);  
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                v.setId(rs.getInt("id"));
                v.setMarca(rs.getString("marca"));
                v.setModelo(rs.getString("modelo"));
                v.setPlaca(rs.getString("placa"));
                v.setCor(rs.getString("cor"));
                v.setAnoLancamento(rs.getInt("anoLancamento"));
                v.setAnoAquisicao(rs.getInt("anoAquisicao"));
                v.setCapacidadeTanque(rs.getDouble("capacidadeTanque"));
                v.setTipoComb(rs.getString("tipoCombustivel"));
                v.setQuantComb(rs.getDouble("quantCombustivel"));
                v.setAcessorios(rs.getString("acessorios"));   
                v.setObservacao(rs.getString("observacao"));
             }
             
             stmt.close();
         } catch(Exception ex){
             JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
             throw new RuntimeException(ex);
         }
         return v;
    }
    public void editar(Veiculo v){
        try {
            
            PreparedStatement stmt = conn.prepareStatement("UPDATE t_veiculo SET marca=?,modelo=?,placa=?,cor=?,anoLancamento=?,anoAquisicao=?,capacidadeTanque =?,tipoCombustivel=?,quantCombustivel=?,acessorios=?,observacao=?,locado=? WHERE id=?;");
            stmt.setString(1, v.getMarca());
            stmt.setString(2, v.getModelo());
            stmt.setString(3, v.getPlaca());
            stmt.setString(4, v.getCor());
            stmt.setInt(5, v.getAnoLancamento());
            stmt.setInt(6, v.getAnoAquisicao());
            stmt.setDouble(7, v.getCapacidadeTanque());
            stmt.setString(8, v.getTipoComb());
            stmt.setDouble(9, v.getQuantComb());
            stmt.setString(10, v.getAcessorios());
            stmt.setString(11, v.getObservacao());
            stmt.setBoolean(12, v.isLocado());
            stmt.setInt(13, v.getId());
            
            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Veículo editado com sucesso!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao editar veículo!");
            throw new RuntimeException(ex);
        }
    }
    public void excluir(int id){
        try{
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM t_veiculo WHERE id=?;");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o veículo!");
            throw new RuntimeException(ex);
        }
    }
}
    
 