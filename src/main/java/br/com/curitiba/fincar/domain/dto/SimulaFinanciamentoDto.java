package br.com.curitiba.fincar.domain.dto;

import br.com.curitiba.fincar.domain.service.FinanceiraService;
import org.springframework.beans.factory.annotation.Autowired;

public class SimulaFinanciamentoDto {

    private double valor;

    private int quantidadeParcelas;

    private Long idFinanceira;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public Long getIdFinanceira() {
        return idFinanceira;
    }

    public void setIdFinanceira(Long idFinanceira) {
        this.idFinanceira = idFinanceira;
    }
}
