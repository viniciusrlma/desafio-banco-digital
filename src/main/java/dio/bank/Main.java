package dio.bank;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(1000);
        Conta cp = new ContaPoupanca();
        cc.transferir(250, cp);
        Conta ci = new ContaInvestimento();
        cc.depositar(15000);
        cc.transferir(10000, ci);
        ((ContaInvestimento) ci).realizarAplicacao(10000, 0.013, 12);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        ci.imprimirExtrato();

        cc.sacar(2000);
        cc.imprimirExtrato();
    }
}
