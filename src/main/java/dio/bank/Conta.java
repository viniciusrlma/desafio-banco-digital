package dio.bank;

public abstract class Conta implements IConta {

    protected static final int AGENCIA_UNICA = 1;
    protected static int SEQUENCIAL = 1;
    protected int agencia;
    protected int conta;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_UNICA;
        this.conta = SEQUENCIAL++;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirAtributosConta() {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


}
