public class ContaPoupanca extends Conta {

    @Override
    public void sacar(double valor) {
        System.out.println("Nenhuma taxa será cobrada");
        descontarDoSaldo(valor);
    }
}
