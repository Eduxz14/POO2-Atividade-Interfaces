public interface OperacoesContaCorrente {

    double realizaDeposito(ContaCorrente contaCorrente, double deposito);

    boolean realizaSaque(ContaCorrente contaCorrente, double saque);

    default void imprimirSaldo(ContaCorrente contaCorrente){
        System.out.println("Imprimindo o valor do saldo em conta: " + contaCorrente.getSaldo());
    }

}
