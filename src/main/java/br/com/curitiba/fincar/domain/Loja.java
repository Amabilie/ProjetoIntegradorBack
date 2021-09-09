package br.com.curitiba.fincar.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loja {

    private String cnpjLoja;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLoja;

    private String statusLoja;
    private int tipoLoja;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private String ramoNegocio;
    private String motivoAprovacao;
    private int percentualClipse;
    private String razaoSocial;
    private String site;

    public Loja() {

    }

    public Loja(String cnpj_loja, Long id_loja, String status_loja, int tipo_loja, String inscricao_estadual, String inscricao_municipal, String ramo_negocio, String motivo_aprovacao, int percentual_clipse, String razao_social, String site) {
        this.cnpjLoja = cnpj_loja;
        this.idLoja = id_loja;
        this.statusLoja = status_loja;
        this.tipoLoja = tipo_loja;
        this.inscricaoEstadual = inscricao_estadual;
        this.inscricaoMunicipal = inscricao_municipal;
        this.ramoNegocio = ramo_negocio;
        this.motivoAprovacao = motivo_aprovacao;
        this.percentualClipse = percentual_clipse;
        this.razaoSocial = razao_social;
        this.site = site;
    }

    public String getCnpjLoja() {
        return cnpjLoja;
    }

    public void setCnpjLoja(String cnpjLoja) {
        this.cnpjLoja = cnpjLoja;
    }

    public Long getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(Long idLoja) {
        this.idLoja = idLoja;
    }

    public String getStatusLoja() {
        return statusLoja;
    }

    public void setStatusLoja(String statusLoja) {
        this.statusLoja = statusLoja;
    }

    public int getTipoLoja() {
        return tipoLoja;
    }

    public void setTipoLoja(int tipoLoja) {
        this.tipoLoja = tipoLoja;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getRamoNegocio() {
        return ramoNegocio;
    }

    public void setRamoNegocio(String ramoNegocio) {
        this.ramoNegocio = ramoNegocio;
    }

    public String getMotivoAprovacao() {
        return motivoAprovacao;
    }

    public void setMotivoAprovacao(String motivoAprovacao) {
        this.motivoAprovacao = motivoAprovacao;
    }

    public int getPercentualClipse() {
        return percentualClipse;
    }

    public void setPercentualClipse(int percentualClipse) {
        this.percentualClipse = percentualClipse;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

}
