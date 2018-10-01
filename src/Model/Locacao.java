/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Pedro Maschio
 */
public class Locacao {
    // locadora
    String nomeLocadora, enderecoLocadora, cnpjLocadora, emailLocadora;
    // locatario
    String nomeLocatario, nascLocatario, enderecoLocatario, telefoneLocatario, cnhLocatario, cpfLocatario, emailLocatario;
    // veiculo
    String marca, modelo, cor, tipoComb, placa, anoLancamento;
    double capaciTanque, quantTanque;
   
    // locacao
    String dataSaida, horarioSaida, dataDevolucao;

    public String getPlaca() {
        return placa;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomeLocadora() {
        return nomeLocadora;
    }

    public void setNomeLocadora(String nomeLocadora) {
        this.nomeLocadora = nomeLocadora;
    }

    public String getEnderecoLocadora() {
        return enderecoLocadora;
    }

    public void setEnderecoLocadora(String enderecoLocadora) {
        this.enderecoLocadora = enderecoLocadora;
    }

    public String getCnpjLocadora() {
        return cnpjLocadora;
    }

    public void setCnpjLocadora(String cnpjLocadora) {
        this.cnpjLocadora = cnpjLocadora;
    }

    public String getEmailLocadora() {
        return emailLocadora;
    }

    public void setEmailLocadora(String emailLocadora) {
        this.emailLocadora = emailLocadora;
    }

    public String getNomeLocatario() {
        return nomeLocatario;
    }

    public void setNomeLocatario(String nomeLocatario) {
        this.nomeLocatario = nomeLocatario;
    }

    public String getNascLocatario() {
        return nascLocatario;
    }

    public void setNascLocatario(String nascLocatario) {
        this.nascLocatario = nascLocatario;
    }

    public String getEnderecoLocatario() {
        return enderecoLocatario;
    }

    public void setEnderecoLocatario(String enderecoLocatario) {
        this.enderecoLocatario = enderecoLocatario;
    }

    public String getTelefoneLocatario() {
        return telefoneLocatario;
    }

    public void setTelefoneLocatario(String telefoneLocatario) {
        this.telefoneLocatario = telefoneLocatario;
    }

    public String getCnhLocatario() {
        return cnhLocatario;
    }

    public void setCnhLocatario(String cnhLocatario) {
        this.cnhLocatario = cnhLocatario;
    }

    public String getCpfLocatario() {
        return cpfLocatario;
    }

    public void setCpfLocatario(String cpfLocatario) {
        this.cpfLocatario = cpfLocatario;
    }

    public String getEmailLocatario() {
        return emailLocatario;
    }

    public void setEmailLocatario(String emailLocatario) {
        this.emailLocatario = emailLocatario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoComb() {
        return tipoComb;
    }

    public void setTipoComb(String tipoComb) {
        this.tipoComb = tipoComb;
    }

    public double getCapaciTanque() {
        return capaciTanque;
    }

    public void setCapaciTanque(double capaciTanque) {
        this.capaciTanque = capaciTanque;
    }

    public double getQuantTanque() {
        return quantTanque;
    }

    public void setQuantTanque(double quantTanque) {
        this.quantTanque = quantTanque;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    
}
