package org.lessons.java.snacks;
/*
    Crea una classe ContoBancario con attributi per numero di conto e saldo. 
    Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero.
    Aggiungi metodi pubblici per depositare denaro sul conto, 
    prelevare denaro dal conto e ottenere il saldo corrente.
 */

import java.math.BigDecimal;

public class ContoBancario {
    // campi
    private String numeroConto;//alfanumerico con 12 cifre
    private BigDecimal saldo;

    // costruttore
    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto.length() == 12 ? numeroConto : null;
        this.saldo = new BigDecimal(0);
    }

    //get&set
    public String getNumeroConto(){
        return numeroConto;
    }
    public BigDecimal getSaldo(){
        return saldo;
    }

    //metodi
    public void depositaSaldo(BigDecimal sommaDepositata){
        this.saldo = this.saldo.add(sommaDepositata);
    }
    public void prelevaSaldo(BigDecimal sommaPrelevata){
        this.saldo = this.saldo.subtract(sommaPrelevata);
    }
}
