package dio.bank;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato conta poupança: ");
        super.imprimirAtributosConta();
    }
}
