package snacks;



public class RegistroStudenti  {

    private Studente[] studenti;
    private int contaStudenti;

    public RegistroStudenti(){
        this.studenti = new Studente[100];
        this.contaStudenti = 0;
    }

    public void aggiungiStudente(Studente s){


        if (contaStudenti < studenti.length) {

            studenti[contaStudenti] = s;

            contaStudenti += 1;

        }


    }


    
}
