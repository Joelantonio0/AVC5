import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Criando alguns titulares
        Titular titular1 = new Titular("João", 123);
        Titular titular2 = new Titular("Maria", 456);

        // Criando uma conta bancária e adicionando titulares
        ContaBancaria conta1 = new ContaBancaria(1);
        conta1.addTitular(titular1);
        conta1.addTitular(titular2);

        // Realizando algumas operações na conta
        // Realizando algumas operações na conta com verificação de saldo
        conta1.deposit(1000);
        double amountToWithdraw = 500;
        if (conta1.getBalance() >= amountToWithdraw) {
            conta1.withdraw(amountToWithdraw);
            System.out.println("Saque de " + amountToWithdraw + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de " + amountToWithdraw + ".");
        }

        //conta1.withdraw(500);

        // Obtendo o saldo da conta
        double saldoConta1 = conta1.getBalance();
        System.out.println("Saldo da conta bancária 1: " + saldoConta1);

        // Criando uma segunda conta bancária
        ContaBancaria conta2 = new ContaBancaria(2);
        conta2.addTitular(new Titular("Carlos", 789));

        // Comparando as contas bancárias
        // Comparando as contas bancárias pelo saldo
        Comparator<ContaBancaria> saldoComparator = new Comparator<ContaBancaria>() {
            @Override
            public int compare(ContaBancaria c1, ContaBancaria c2) {
                return Double.compare(c1.getBalance(), c2.getBalance());
            }
        };

        int result = saldoComparator.compare(conta1, conta2);
        if (result < 0) {
            System.out.println("A conta bancária 1 tem um saldo menor que a conta bancária 2.");
        } else if (result > 0) {
            System.out.println("A conta bancária 2 tem um saldo menor que a conta bancária 1.");
        } else {
            System.out.println("As contas bancárias têm o mesmo saldo.");
        }
    }
}
