package br.com.curitiba.fincar.domain.service;

import br.com.curitiba.fincar.domain.Financeira;
import br.com.curitiba.fincar.domain.dto.SimulaFinanciamentoDto;
import br.com.curitiba.fincar.domain.dto.SimulaFinanciamentoRetornoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FinanciamentoService {

    @Autowired
    private FinanceiraService financeiraService;


    public double buscaTaxaMensal(SimulaFinanciamentoDto simulaFinanciamentoDto) {

        Optional<Financeira> financeira = financeiraService.getPorId(simulaFinanciamentoDto.getIdFinanceira());

        return financeira.get().getTaxaMensal();
    }

    private double buscaTarifa(SimulaFinanciamentoDto simulaFinanciamentoDto) {

        Optional<Financeira> financeira = financeiraService.getPorId(simulaFinanciamentoDto.getIdFinanceira());

        return financeira.get().getTarifa();
    }

    public SimulaFinanciamentoRetornoDto simularFinanciamento(SimulaFinanciamentoDto simulaFinanciamentoDto) {

        double valor = simulaFinanciamentoDto.getValor();
        double taxaMensal = buscaTaxaMensal(simulaFinanciamentoDto);
        int quantidadeParcelas = simulaFinanciamentoDto.getQuantidadeParcelas();

        double valorTotal = valor * Math.pow((1 + taxaMensal), quantidadeParcelas);

        double tarifa = buscaTarifa(simulaFinanciamentoDto);

        double cet = valorTotal + (tarifa * quantidadeParcelas);

        SimulaFinanciamentoRetornoDto simulaFinanciamentoRetornoDto = new SimulaFinanciamentoRetornoDto();
        simulaFinanciamentoRetornoDto.setValor(simulaFinanciamentoDto.getValor());
        simulaFinanciamentoRetornoDto.setValorTotal(valorTotal);
        simulaFinanciamentoRetornoDto.setTaxaMensal(taxaMensal);
        simulaFinanciamentoRetornoDto.setTarifa(tarifa);
        simulaFinanciamentoRetornoDto.setCet(cet);
        return simulaFinanciamentoRetornoDto;
    }
}

