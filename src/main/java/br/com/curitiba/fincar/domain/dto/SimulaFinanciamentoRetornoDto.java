package br.com.curitiba.fincar.domain.dto;

import br.com.curitiba.fincar.domain.service.FinanceiraService;
import org.springframework.beans.factory.annotation.Autowired;

public class SimulaFinanciamentoRetornoDto {

    private double valor;

    private double valorTotal;

    private Long idFinanceira;

    private double cet;

    private double taxaMensal;

    private double tarifa;

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getCet() {
        return cet;
    }

    public void setCet(double cet) {
        this.cet = cet;
    }

    public double getTaxaMensal() {
        return taxaMensal;
    }

    public void setTaxaMensal(double taxaMensal) {
        this.taxaMensal = taxaMensal;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Long getIdFinanceira() {
        return idFinanceira;
    }

    public void setIdFinanceira(Long idFinanceira) {
        this.idFinanceira = idFinanceira;
    }
}
