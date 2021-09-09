package br.com.curitiba.fincar.api;

import br.com.curitiba.fincar.domain.Loja;
import br.com.curitiba.fincar.domain.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loja")
public class LojaController {
    @Autowired
    private LojaService service;

    @GetMapping()
    @Secured({"ROLE_ADMIN"})
    public Iterable<Loja> get() {
        return service.getLojas();
    }

    @PostMapping("/cadastrarLoja")
    @Secured({"ROLE_ADMIN"})
    public String post(@RequestBody Loja loja) {
        Loja l = service.save(loja);
        return "Loja cadastrada com sucesso" + l;
    }
}
