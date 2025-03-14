package org.lessons.java.snacks;
/*
 Crea una classe RegistroStudenti che rappresenti un registro di studenti. 
 Utilizza un array privato per memorizzare oggetti Studente. 
 Implementa un costruttore senza parametri per inizializzare il registro 
 vuoto e un metodo pubblico per aggiungere studenti al registro. 
 Aggiungi un metodo che stampi la lista degli studenti.
 */
public class RegistroStudenti {
    //campi
    private String nomeStudente;
    private String cognomeStudente;
    
    RegistroStudenti[] arrayRegistroStudenti = new RegistroStudenti[0];
    //costruttore
    public RegistroStudenti(){
        
    }

    //get&set
    public String getNomeStudente(){
        return nomeStudente;
    }
    public void setNomeStudente(String nome){
        this.nomeStudente = nome;
    }

    public String getCognomeStudente(){
        return cognomeStudente;
    }
    public void setCognomeStudente(String cognome){
        this.cognomeStudente = cognome;
    }
    //metodi

}
