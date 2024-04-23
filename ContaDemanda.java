


// Classe ContaDemanda representa uma conta à ordem
public class ContaDemanda extends ContaDeposito {
    private double balance;

    public ContaDemanda(){
        super();
    }
    public ContaDemanda(int accountNumber, double balance, double interestRate, long startDate) {
        super(accountNumber, balance, interestRate, startDate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            throw new IllegalArgumentException("Withdrawal amount exceeds balance");
        }
        this.setBalance(getBalance() - amount);
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
