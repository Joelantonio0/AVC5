

// Classe Conta Poupança representa uma conta poupança
public class ContaPoupanca extends ContaDeposito {
    private double duration; // Duração em dias

    public ContaPoupanca(int accountNumber, double balance, double interestRate, long startDate, double duration) {
        super(accountNumber, balance, interestRate, startDate);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Não pode sacar da conta poupança");
    }
}
