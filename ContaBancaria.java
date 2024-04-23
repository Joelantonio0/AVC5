// Classe Conta Bancária representa uma conta bancária

import java.util.ArrayList;
import java.util.List;

class ContaBancaria implements Comparable<ContaBancaria> {
    private int accountNumber;
    private List<Titular> titular;
    private ContaDemanda contaDemanda;
    private List<ContaPoupanca> contaPoupanca;

    public ContaBancaria(int accountNumber) {
        this.accountNumber = accountNumber;
        this.titular = new ArrayList<>();
        this.contaPoupanca = new ArrayList<>();
        this.contaDemanda = new ContaDemanda();
    }

    public void addTitular(Titular titular) {
        this.titular.add(titular);
    }

    public void removeTitular(Titular titular) {
        this.titular.remove(titular);
    }

    public void deposit(double amount) {
        contaDemanda.deposit(amount);
    }

    public void withdraw(double amount) {
        contaDemanda.withdraw(amount);
    }

    public double getDemandAccountBalance() {
        return contaDemanda.getBalance();
    }

    public double getBalance() {
        double balance = contaDemanda.getBalance();
        for (ContaPoupanca sa : contaPoupanca) {
            balance += sa.getBalance();
        }
        return balance;
    }

    public boolean canBeRemoved() {
        return getBalance() == 0;
    }

    public List<Titular> gettitular() {
        return titular;
    }

    public List<ContaPoupanca> getSavingsAccounts() {
        return contaPoupanca;
    }

    @Override
    public int compareTo(ContaBancaria other) {
        return Integer.compare(this.accountNumber, other.accountNumber);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContaBancaria)) {
            return false;
        }
        ContaBancaria other = (ContaBancaria) obj;
        return this.accountNumber == other.accountNumber;
    }
}
