public abstract class Conta {

    private double saldo;
  
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor depositado de " + valor + " reias \n" + "Saldo: " + saldo);
    }

    protected void descontarDoSaldo(double valor) {
        saldo -= valor;
        System.out.println("Valor retirado de " + valor + " reias \n" + "Saldo: " + saldo);

    }

    public abstract void sacar(double valor);
}