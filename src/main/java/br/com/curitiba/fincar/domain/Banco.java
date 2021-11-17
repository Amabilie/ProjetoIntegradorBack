package br.com.curitiba.fincar.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Banco {

   @Id
   private Long id;

    private String cod;

    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco() {

    }

    public Banco(Long id, String cod, String nome) {
        this.id = id;
        this.cod = cod;
        this.nome = nome;
    }
}
