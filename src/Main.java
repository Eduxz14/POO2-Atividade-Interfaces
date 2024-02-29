public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente("1234", "5542", 1000d);

        OperacoesContaCorrente operacoes = new OperacoesContaCorrenteImpl();

        operacoes.realizaDeposito(contaCorrente, 500);
        System.out.println(contaCorrente.getSaldo());

        operacoes.realizaSaque(contaCorrente, 2000);
        System.out.println(contaCorrente.getSaldo());



        operacoes.imprimirSaldo(contaCorrente);
    }
}