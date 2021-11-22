package br.com.curitiba.fincar.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EnderecoLoja {

    @Id
    private String idCnpj;
    private String uf;
    private String cidade;
    private String bairro;
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;

    public EnderecoLoja() {

    }

    public EnderecoLoja(String idCnpj, String uf, String cidade, String bairro, String tipoLogadouro, String numero, String complemento, String cep) {
        this.idCnpj = idCnpj;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getIdCnpj() {
        return idCnpj;
    }

    public void setIdCnpj(String idCnpj) {
        this.idCnpj = idCnpj;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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

    public String getLogradouroo() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
