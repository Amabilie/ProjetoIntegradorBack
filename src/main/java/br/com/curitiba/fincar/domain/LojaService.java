package br.com.curitiba.fincar.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LojaService {

    @Autowired
    private LojaRepository rep;

    public Iterable<Loja> getLojas() {
        return rep.findAll();
    }

    public Loja save(Loja loja) {
        return rep.save(loja);
    }
}
