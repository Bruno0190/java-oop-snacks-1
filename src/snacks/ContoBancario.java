package snacks;

public class ContoBancario {

    private long numeroConto;
    private float saldo;

    public ContoBancario(long numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    public long getNumeroConto() {
        return numeroConto;
    }

    public void setNumeroConto(int numeroConto) {
        this.numeroConto = numeroConto;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float deposita(float importo) {
        saldo += importo;
        return saldo;
    }

    public float preleva(float prelievo) {
        saldo -= prelievo;
        return saldo;
    }

    public float getSaldo() {
        return saldo;
    }
}

