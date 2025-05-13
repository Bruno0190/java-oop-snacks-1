package snacks;

public class Studente {

    private String nome;
    private String cognome;
    private int eta;

    public Studente(String nome, String cognome, int eta) {

        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    
        
    }

    public String stringaConcatenata(){

        return("Mi chiamo " + nome + " " + cognome + " e ho " + eta + " anni");

    }

}
