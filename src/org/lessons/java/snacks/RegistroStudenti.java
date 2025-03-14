package org.lessons.java.snacks;

/*
 Crea una classe RegistroStudenti che rappresenti un registro di studenti. 
 Utilizza un array privato per memorizzare oggetti Studente. 
 Implementa un costruttore senza parametri per inizializzare il registro 
 vuoto e un metodo pubblico per aggiungere studenti al registro. 
 Aggiungi un metodo che stampi la lista degli studenti.
 */
public class RegistroStudenti {
    // campi
    public static RegistroStudenti[] arrayRegistroStudenti = new RegistroStudenti[0];
    private String nomeStudente;
    private String cognomeStudente;

    // costruttore
    public RegistroStudenti(String nome, String cognome) {
        this.nomeStudente = nome;
        this.cognomeStudente = cognome;
    }

    // get&set
    public String getNomeStudente() {
        return nomeStudente;
    }

    public void setNomeStudente(String nome) {
        this.nomeStudente = nome;
    }

    public String getCognomeStudente() {
        return cognomeStudente;
    }

    public void setCognomeStudente(String cognome) {
        this.cognomeStudente = cognome;
    }

    // metodi
    public void setNewRegistroStudentiArray() {
        
        RegistroStudenti[] temp = arrayRegistroStudenti;
        int num = arrayRegistroStudenti.length;

        arrayRegistroStudenti = new RegistroStudenti[num + 1];

        arrayRegistroStudenti[0] = this;

        // for (int i = 1; i < arrayRegistroStudenti.length; i++) {
        //     arrayRegistroStudenti[i] = temp[i - 1];
        // }
        System.arraycopy(temp, 0, arrayRegistroStudenti, 1, num);
    }

    public static String stampaStudenti() {
        String accumulo = "";
        for (int i = 0; i < arrayRegistroStudenti.length; i++) {
            accumulo += arrayRegistroStudenti[i].nomeStudente + "-"
                    + arrayRegistroStudenti[i].cognomeStudente + "\n";
        }
        return accumulo;
    }
}
