import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaCorrente cont = new ContaCorrente();
        ContaPoupanca cont2 = new ContaPoupanca();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("""
                    0 - Conta corrente
                    2 - Conta poupança
                    4 - Sair
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
                                    4 - Sair
                            Digite um numero
                            """);
                    escolha1 = sc.nextInt();

                    switch (escolha1) {
                        case 1 -> {
                            System.out.println("Qual valor você desejaria depositar");
                            double valorDeposito = sc.nextInt();
                            cont.depositar(valorDeposito);
                        }
                        case 2 -> {
                            System.out.println("Qual valor você desejaria sacar");
                            double valorSacar = sc.nextDouble();
                            cont.sacar(valorSacar);
                        }
                        case 3 -> System.out.println(cont.getSaldo());
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
                                    4 - Sair
                                Digite um numero
                            """);
                    escolha2 = sc.nextInt();
                    switch (escolha2) {
                        case 1 -> {
                            System.out.println("Qual valor você desejaria depositar");
                            double valorDeposito = sc.nextInt();
                            cont2.depositar(valorDeposito);
                        }
                        case 2 -> {
                            System.out.println("Qual valor você desejaria sacar");
                            double valorSacar = sc.nextDouble();
                            cont2.sacar(valorSacar);
                        }
                        case 3 -> System.out.println(cont2.getSaldo());
                        case 4 -> System.out.println("Encerrando conta poupança");
                    }
                }
            }
        }
        System.out.println("Fechando banco");
        sc.close();
    }
}