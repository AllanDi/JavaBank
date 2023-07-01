public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 500;

        System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta);
    }
}
