public class TestaMetodo {
    public static void main(String[] args) {

        Conta contaPaulo = new Conta();
        Conta contaMarcela = new Conta();

        contaMarcela.saldo = 1000;
        contaPaulo.saldo = 100;

        //testa deposita
        contaPaulo.deposita(50);
        System.out.println(contaPaulo.saldo);

        //testa seca
        contaPaulo.saca(20);
        System.out.println(contaPaulo.saldo);

        //verifica retorno boolean
        boolean verifica = contaPaulo.saca(20);
        System.out.println(contaPaulo.saldo);
        System.out.println(verifica);

        contaMarcela.transfere(200, contaPaulo);
        System.out.println(contaPaulo.saldo);
        System.out.println(contaMarcela.saldo);

        boolean verifica1 = contaMarcela.transfere(900, contaPaulo);
        System.out.println(contaMarcela.saldo);
        System.out.println(verifica1);

        System.out.println("Inicio testes com cliente");


        Conta.Cliente clientePaulo = new Conta.Cliente();

        clientePaulo.nome = "Paulo";
        clientePaulo.cpf = "222.222.222-22";
        clientePaulo.profissão = "Programador";

        System.out.println(clientePaulo.nome);
        System.out.println(clientePaulo.cpf);
        System.out.println(clientePaulo.profissão);

        contaPaulo.titular = clientePaulo;

        System.out.println(contaPaulo.titular.cpf);




    }
}
