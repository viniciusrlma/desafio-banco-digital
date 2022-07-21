package dio.bank;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato conta corrente: ");
        super.imprimirAtributosConta();
    }

}
