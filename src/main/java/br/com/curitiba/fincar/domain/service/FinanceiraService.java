package br.com.curitiba.fincar.domain.service;

import br.com.curitiba.fincar.domain.Banco;
import br.com.curitiba.fincar.domain.Financeira;
import br.com.curitiba.fincar.domain.FinanceiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FinanceiraService {

    @Autowired
    private FinanceiraRepository rep;

    public void save(Financeira financeira) {
        rep.save(financeira);
    }

    public Iterable<Financeira> getFinanceiras() {
        return rep.findAll();
    }

    public Optional<Financeira> getPorId(Long id) {
        return rep.findById(id);
    }
}
