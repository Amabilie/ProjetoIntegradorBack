package br.com.curitiba.fincar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class ImpostoIof {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private BigDecimal aliquota;

    private boolean vigente;

    private Date inicioVigencia;

    public ImpostoIof() {
        this.inicioVigencia = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }
}
