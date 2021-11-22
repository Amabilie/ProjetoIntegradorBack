package br.com.curitiba.fincar.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CadastroDto {

    private String cnpj;

    private String razaoSocial;

    private String nomeBanco;

    private String nBanco;

    private String nAgencia;

    private String contaCorrente;

    private String cep;

    private String rua;

    private String numeroEndereco;

    private String complementoEndereco;

    private String cidade;

    private String bairro;

    private String estado;

    private String siteLoja;

    private String cpfResponsavel;

    private String nomeResponsavel;

    private String nTelefoneResponsavel;

    private String nTelefoneComercia;

    private String emailResponsavel;

    private String senhaAcesso;

    private String senhaAcessoRepetida;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getnBanco() {
        return nBanco;
    }

    public void setnBanco(String nBanco) {
        this.nBanco = nBanco;
    }

    public String getnAgencia() {
        return nAgencia;
    }

    public void setnAgencia(String nAgencia) {
        this.nAgencia = nAgencia;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSiteLoja() {
        return siteLoja;
    }

    public void setSiteLoja(String siteLoja) {
        this.siteLoja = siteLoja;
    }

    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getnTelefoneResponsavel() {
        return nTelefoneResponsavel;
    }

    public void setnTelefoneResponsavel(String nTelefoneResponsavel) {
        this.nTelefoneResponsavel = nTelefoneResponsavel;
    }

    public String getnTelefoneComercia() {
        return nTelefoneComercia;
    }

    public void setnTelefoneComercia(String nTelefoneComercia) {
        this.nTelefoneComercia = nTelefoneComercia;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public void setEmailResponsavel(String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }

    public String getSenhaAcessoRepetida() {
        return senhaAcessoRepetida;
    }

    public void setSenhaAcessoRepetida(String senhaAcessoRepetida) {
        this.senhaAcessoRepetida = senhaAcessoRepetida;
    }
}
