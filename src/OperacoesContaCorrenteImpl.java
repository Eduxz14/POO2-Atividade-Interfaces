public class OperacoesContaCorrenteImpl implements OperacoesContaCorrente {

    @Override
    public double realizaDeposito(ContaCorrente contaCorrente, double deposito) {
        if (deposito > 0) {
            contaCorrente.setSaldo(contaCorrente.getSaldo() + deposito);
            System.out.println("\nO deposito foi realizado com sucesso!!");
            return contaCorrente.getSaldo();
        } else {
            System.out.println("\nErro!!\nO valor do deposito não pode ser negativo!!");
            return contaCorrente.getSaldo();
        }
    }

    @Override
    public boolean realizaSaque(ContaCorrente contaCorrente, double saque) {
        if (saque <= contaCorrente.getSaldo()) {
            contaCorrente.setSaldo(contaCorrente.getSaldo() - saque);
            System.out.println("\nSaque de: " + saque + " Realizado com sucesso!");
            System.out.println("\no saldo atual é de:" + contaCorrente.getSaldo()+"\n");
            return true;

        } else {
            System.out.println("\nErro!!\nO saldo é insulficiente, não é possivel realizar saque!\n");
            return false;
        }
    }
}

