package br.com.curitiba.fincar.domain;

import org.springframework.data.repository.CrudRepository;

public interface LojaRepository extends CrudRepository<Loja, String> {

    Loja findByCnpjLoja(String cnpjLoja);
}
