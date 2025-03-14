package org.lessons.java.snacks;
/*
 Snack 1: Studente
Scrivi una classe Studente con i seguenti attributi: nome, cognome, età. 
Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. 
Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni).
 */
public class Studente {
    //campi
    private String nome;
    private String cognome;
    private int anni;

    //costruttore
    public Studente(String nome, String cognome, int anni) {
        this.nome = nome.length() > 0 ? nome : "nome non definito";
        this.cognome = cognome.length() > 0 ? cognome : "cognome non definito";
        this.anni = anni >= 0.1 ? anni : 0; 
    }

    //get&set
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome!=null && !nome.isEmpty()){
            this.nome = nome;
        }
    }
    public String getCognome(){
        return cognome;
    }
    public void setCognome(String cognome){
        if(cognome!=null && !cognome.isEmpty()){
            this.cognome = cognome;
        }
    }
    public int getAnni(){
        return anni;
    }
    public void setAnni(int anni){
        if(anni>=0.1){
            this.anni = anni;
        }
    }
    public String nomeConcatenato(){
        return this.nome + " " + this.cognome + ", " + this.anni + " anni";
    } 
}
