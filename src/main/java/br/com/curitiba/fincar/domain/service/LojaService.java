package br.com.curitiba.fincar.domain.service;

import br.com.curitiba.fincar.domain.Loja;
import br.com.curitiba.fincar.domain.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LojaService {

    @Autowired
    private LojaRepository rep;

    public Iterable<Loja> getLojas() {
        return rep.findAll();
    }

    public Loja getLojaPorCnpj(String cnpjLoja) {
        return rep.findByCnpjLoja(cnpjLoja);
    }

    public Loja save(Loja loja) {
        return rep.save(loja);
    }
}
