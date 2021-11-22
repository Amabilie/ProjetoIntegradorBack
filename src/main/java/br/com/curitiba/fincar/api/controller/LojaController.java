package br.com.curitiba.fincar.api.controller;

import br.com.curitiba.fincar.domain.Banco;
import br.com.curitiba.fincar.domain.Loja;
import br.com.curitiba.fincar.domain.service.LojaService;
import br.com.curitiba.fincar.domain.dto.CadastroDto;
import br.com.curitiba.fincar.domain.exception.CadastroLojaException;
import br.com.curitiba.fincar.domain.service.BancoService;
import br.com.curitiba.fincar.domain.service.CadastroService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/loja")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    @Autowired
    private BancoService bancoService;

    @Autowired
    private CadastroService cadastroService;

    public LojaController(LojaService service, BancoService bancoService, CadastroService cadastroService) {
        this.lojaService = service;
        this.bancoService = bancoService;
        this.cadastroService = cadastroService;
    }

    @GetMapping()
    @Secured({"ROLE_ADMIN"})
    @ApiOperation(value= "Lista as lojas cadastradas na base")
    public Iterable<Loja> get() {
        return lojaService.getLojas();
    }

    @GetMapping("/{cnpj}")
    @ApiOperation(value= "Busca na base uma loja por CNPJ")
    public ResponseEntity get(@PathVariable("cnpj") String cnpj) {
        Optional<Loja> loja = Optional.ofNullable(lojaService.getLojaPorCnpj(cnpj));

        if(loja.isPresent()) {
            Loja lojaEncontrada = loja.get();
            return ResponseEntity.ok(lojaEncontrada);
        } else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/validaCnpj/{cnpj}")
    @ApiOperation(value= "Valida CNPJ")
    public ResponseEntity validaCnpj(@PathVariable("cnpj") String cnpj) {
        if(cadastroService.isCnpjValido(cnpj)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/bancos")
    @ApiOperation(value= "Retorna lista de bancos cadastrados")
    public Iterable<Banco> retornaBancos() {
        return bancoService.getBancos();
    }

    @PostMapping("/cadastrarLoja")
//    @Secured({"ROLE_ADMIN"})
    @ApiOperation(value= "Cadastra um novo cliente/usuário")
    public void cadastraLoja(@RequestBody CadastroDto cadastroDto) throws CadastroLojaException {

       try {
           cadastroService.cadastrarLoja(cadastroDto);
       } catch (Exception e) {
           log.error("Erro ao realizar cadastro:", e);
       }
    }
}

