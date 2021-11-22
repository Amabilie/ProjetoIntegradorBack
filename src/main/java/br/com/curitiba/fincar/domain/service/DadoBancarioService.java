package br.com.curitiba.fincar.domain.service;

import br.com.curitiba.fincar.domain.DadoBancario;
import br.com.curitiba.fincar.domain.DadoBancarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadoBancarioService {

    @Autowired
    private DadoBancarioRepository rep;

    public void save(DadoBancario dadoBancario) {
       rep.save(dadoBancario);
    }
}
