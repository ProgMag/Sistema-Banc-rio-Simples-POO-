import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaCorrente contCorrente = new ContaCorrente();
        ContaPoupanca contPoupanca = new ContaPoupanca();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("""
                    0 - Conta corrente
                    2 - Conta poupança
                    4 - Sair do banco
                    Digite a opção desejada:
                    """);
            opcao = sc.nextInt();

            if (opcao == 0) {
                int escolha1 = 0;
                while (escolha1 != 4) {
                    System.out.println("""
                             --- Conta Corrente ---
                                    1 - Deposito
                                    2 - Saque
                                    3 - Saldo
                                    4 - Sair da conta corrente
                            Digite um numero
                            """);
                    escolha1 = sc.nextInt();

                    switch (escolha1) {
                        case 1 -> {
                            System.out.println("Qual valor você desejaria depositar");
                            double valorDeposito = sc.nextInt();
                            contCorrente.depositar(valorDeposito);
                        }
                        case 2 -> {
                            System.out.println("Qual valor você desejaria sacar");
                            double valorSacar = sc.nextDouble();
                            if (valorSacar > contCorrente.getSaldo()) {
                                System.out.println("Não será possível sacar " + valorSacar
                                        + " reais.\n O valor é maior do que seu saldo: " + contCorrente.getSaldo());
                            } else {
                                contCorrente.sacar(valorSacar);
                            }
                        }
                        case 3 -> System.out.println(contCorrente.getSaldo());
                        case 4 -> System.out.println("Encerrando conta corrente");
                    }
                }
            }
            if (opcao == 2) {
                int escolha2 = 0;

                while (escolha2 != 4) {
                    System.out.println("""
                             --- Conta Poupança ---
                                    1 - Deposito
                                    2 - Saque
                                    3 - Saldo
                                    4 - Sair da conta poupança
                                Digite um numero
                            """);
                    escolha2 = sc.nextInt();
                    switch (escolha2) {
                        case 1 -> {
                            System.out.println("Qual valor você desejaria depositar");
                            double valorDeposito = sc.nextInt();
                            contPoupanca.depositar(valorDeposito);
                        }
                        case 2 -> {
                            System.out.println("Qual valor você desejaria sacar");
                            double valorSacar = sc.nextDouble();
                            if (valorSacar > contCorrente.getSaldo()) {
                                System.out.println("Não será possível sacar " + valorSacar
                                        + " reais.\n O valor é maior do que seu saldo: " + contPoupanca.getSaldo());
                            } else {
                                 contPoupanca.sacar(valorSacar);
                            }
                        }
                        case 3 -> System.out.println(contPoupanca.getSaldo());
                        case 4 -> System.out.println("Encerrando seu conta poupança");
                    }
                }
            }
        }
        System.out.println("Fechando banco");
        sc.close();
    }
}