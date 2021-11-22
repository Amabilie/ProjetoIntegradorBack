package br.com.curitiba.fincar.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String cpfUsuario;
    private String nomeContato;
    private String estadoUsuario;
    private String telefoneCelular;
    private String telefoneComercial;
    private String email;
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    private String senha;
    private String senhaRepetida;
    private Date dataNascimento;
    private Date dataEmissaoDocumento;
    private Date dataValidade;
    private String tipoDocumento;
    private String numeroCocumento;
    private String orgaoEmissorDocumento;
    private String naturalCidade;
    private String cargo;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String cpfUsuario, String nomeContato, String estadoUsuario, String telefoneCelular, String telefoneComercial, String email, String senha, String senhaRepetida, Date dataNascimento, Date dataEmissaoDocumento, Date dataValidade, String tipoDocumento, String numeroCocumento, String orgaoEmissorDocumento, String naturalCidade, String cargo) {
        this.idUsuario = idUsuario;
        this.cpfUsuario = cpfUsuario;
        this.nomeContato = nomeContato;
        this.estadoUsuario = estadoUsuario;
        this.telefoneCelular = telefoneCelular;
        this.telefoneComercial = telefoneComercial;
        this.email = email;
        this.senha = senha;
        this.senhaRepetida = senhaRepetida;
        this.dataNascimento = dataNascimento;
        this.dataEmissaoDocumento = dataEmissaoDocumento;
        this.dataValidade = dataValidade;
        this.tipoDocumento = tipoDocumento;
        this.numeroCocumento = numeroCocumento;
        this.orgaoEmissorDocumento = orgaoEmissorDocumento;
        this.naturalCidade = naturalCidade;
        this.cargo = cargo;
    }
    public Long getIdUsuario() {
        return idUsuario;
    }


    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenhaRepetida() {
        return senhaRepetida;
    }

    public void setSenhaRepetida(String senhaRepetida) {
        this.senhaRepetida = senhaRepetida;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataEmissaoDocumento() {
        return dataEmissaoDocumento;
    }

    public void setDataEmissaoDocumento(Date dataEmissaoDocumento) {
        this.dataEmissaoDocumento = dataEmissaoDocumento;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroCocumento() {
        return numeroCocumento;
    }

    public void setNumeroCocumento(String numeroCocumento) {
        this.numeroCocumento = numeroCocumento;
    }

    public String getOrgaoEmissorDocumento() {
        return orgaoEmissorDocumento;
    }

    public void setOrgaoEmissorDocumento(String orgaoEmissorDocumento) {
        this.orgaoEmissorDocumento = orgaoEmissorDocumento;
    }

    public String getNaturalCidade() {
        return naturalCidade;
    }

    public void setNaturalCidade(String naturalCidade) {
        this.naturalCidade = naturalCidade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
