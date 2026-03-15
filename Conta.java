public abstract class Conta {

    private String titular;
    private double saldo;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Titular: " + titular + "\nValor depositado de " + valor + " reias \n" + "Saldo: " + saldo);
    }

    protected void descontarDoSaldo(double valor) {
        saldo -= valor;
        System.out.println("Titular: " + titular + "\nValor retirado de " + valor + " reias \n" + "Saldo: " + saldo);

    }

    public abstract void sacar(double valor);
}