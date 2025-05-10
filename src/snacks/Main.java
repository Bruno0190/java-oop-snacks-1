package snacks;

public class Main {

    public static void main(String[] args) {
        
        Studente scolaro = new Studente("Anselmo", "Bitta", 24);

        System.out.println(scolaro.stringaConcatenata());

        ContoBancario conto = new ContoBancario(784221566);

        System.out.println(conto.getNumeroConto());

        conto.deposita(500);

        System.out.println(conto.getSaldo());

        conto.preleva(200);

        System.out.println(conto.getSaldo());

    }

}
