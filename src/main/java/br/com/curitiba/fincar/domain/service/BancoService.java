package br.com.curitiba.fincar.domain.service;

import br.com.curitiba.fincar.domain.Banco;
import br.com.curitiba.fincar.domain.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BancoService {

   @Autowired
   private BancoRepository rep;

    public Iterable<Banco> getBancos() {
        return rep.findAll();
    }
}
