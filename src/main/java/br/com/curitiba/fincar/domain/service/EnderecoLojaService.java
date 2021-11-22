package br.com.curitiba.fincar.domain.service;

import br.com.curitiba.fincar.domain.EnderecoLoja;
import br.com.curitiba.fincar.domain.EnderecoLojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoLojaService {

    @Autowired
    private EnderecoLojaRepository rep;

    public EnderecoLoja save(EnderecoLoja enderecoLoja) {
        return rep.save(enderecoLoja);
    }
}
