public class Main {
    public static void main(String[] args) {

        ContaCorrente cont = new ContaCorrente();
        
        cont.setTitular("Gui");
        cont.depositar(100);
        cont.depositar(200);

        cont.sacar(10);
        System.out.println(cont.getSaldo());
    }
}