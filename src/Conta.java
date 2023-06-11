public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Conta.Cliente titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public static class Cliente {
        String nome;
        String cpf;
        String profissão;
    }

    public double getSaldo(){
        return this.saldo;
    }
}