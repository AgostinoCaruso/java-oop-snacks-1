package org.lessons.java.snacks;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //Snack-1
        // Studente studente1 = new Studente("Giacomo","Rossi",20);
        // System.out.println(studente1.nomeConcatenato());

        //Snack-2
        // ContoBancario conto1 = new ContoBancario("000000123456");
        // System.out.println(conto1.getSaldo());
        // BigDecimal sommaDepositata = new BigDecimal("999.99");
        // conto1.depositaSaldo(sommaDepositata);
        // System.out.println(conto1.getSaldo());
        // BigDecimal sommaPrelevata = new BigDecimal("300.99");
        // conto1.prelevaSaldo(sommaPrelevata);
        // System.out.println(conto1.getSaldo());

        //Snack-3
        RegistroStudenti studente1 = new RegistroStudenti("Fra", "Totti");
        System.out.println(RegistroStudenti.arrayRegistroStudenti.length);
        studente1.setNewRegistroStudentiArray();
        System.out.println(RegistroStudenti.arrayRegistroStudenti.length);
        RegistroStudenti studente2 = new RegistroStudenti("Dua", "Lipa");
        studente2.setNewRegistroStudentiArray();
        RegistroStudenti studente3 = new RegistroStudenti("Valeria","Rossi");
        studente3.setNewRegistroStudentiArray();
        RegistroStudenti studente4 = new RegistroStudenti("Kam", "Polaris");
        studente4.setNewRegistroStudentiArray();
        System.out.println(RegistroStudenti.arrayRegistroStudenti.length);
        System.out.println(RegistroStudenti.stampaStudenti());
    }
}
