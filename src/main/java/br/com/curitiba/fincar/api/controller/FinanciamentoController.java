package br.com.curitiba.fincar.api.controller;

import br.com.curitiba.fincar.domain.Banco;
import br.com.curitiba.fincar.domain.Financeira;
import br.com.curitiba.fincar.domain.dto.SimulaFinanciamentoDto;
import br.com.curitiba.fincar.domain.dto.SimulaFinanciamentoRetornoDto;
import br.com.curitiba.fincar.domain.service.FinanceiraService;
import br.com.curitiba.fincar.domain.service.FinanciamentoService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/financiamento")
public class FinanciamentoController {

    @Autowired
    private FinanceiraService financeiraService;

    @Autowired
    private FinanciamentoService financiamentoService;

    @GetMapping("/financeiras")
    @ApiOperation(value= "Retorna lista de financeiras e taxas")
    public Iterable<Financeira> retornaFinaceiras() {
        return financeiraService.getFinanceiras();
    }

    @GetMapping("/simulacao")
    @ApiOperation(value= "Simula o valor do financmento")
    public SimulaFinanciamentoRetornoDto simulaFinanciamento(SimulaFinanciamentoDto simulaFinanciamentoDto) {
        return financiamentoService.simularFinanciamento(simulaFinanciamentoDto);
    }
}
