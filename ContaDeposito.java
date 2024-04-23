// Classe ContaDeposito é uma classe abstrata representando contas de depósito
public abstract class ContaDeposito {
    private int accountNumber;
    private double balance;
    private double interestRate;
    private long startDate; // Pode ser representado como um timestamp em milissegundos


    public ContaDeposito(){
        
    }
    public ContaDeposito(int accountNumber, double balance, double interestRate, long startDate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
        this.startDate = startDate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    // Método abstrato para sacar uma quantia
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void updateBalance() {
        
    }
}
