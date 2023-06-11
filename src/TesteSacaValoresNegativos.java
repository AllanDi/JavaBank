public class TesteSacaValoresNegativos {

    public static void main(String[] args) {
        Conta conta = new Conta();

        System.out.println(conta.getSaldo());
        conta.deposita(100);
        System.out.println(conta.getSaldo());
        System.out.println(conta.saca(50));
        System.out.println(conta.getSaldo());


//        // proibido:
//        conta.saldo = conta.saldo - 51;
//        System.out.println(conta.saldo);





    }
}
