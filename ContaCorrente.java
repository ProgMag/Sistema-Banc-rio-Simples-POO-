public class ContaCorrente extends Conta {

    @Override
    public void sacar(double valor) {
        double taxa = 5d;
        double totalADescontar = valor + taxa;
        descontarDoSaldo(totalADescontar);

        System.out.println("Taxa por saque: " + taxa + " reias");
    }
}
