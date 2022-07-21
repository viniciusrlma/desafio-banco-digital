package dio.bank;

public class ContaInvestimento extends Conta {

    public double saldoEmAplicacaoFinanceira;
    public double projecaoRendimentoAplicacao;

    public void realizarAplicacao(double valorAplicado, double taxaRendimento, double tempoAplicacao) {
        saldo -= valorAplicado;
        saldoEmAplicacaoFinanceira += valorAplicado;
        projecaoRendimentoAplicacao = saldoEmAplicacaoFinanceira * taxaRendimento * tempoAplicacao;


    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato conta investimento: ");
        super.imprimirAtributosConta();
        System.out.println(String.format("Saldo em aplicações financeiras: %.2f", saldoEmAplicacaoFinanceira));
        System.out.println(String.format("Projeção estimada de rendimento das aplicações: %.2f", projecaoRendimentoAplicacao));
    }

    }
