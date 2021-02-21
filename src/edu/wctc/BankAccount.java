package edu.wctc;

public class BankAccount {
    private double deposit;
    private double withdrawal;
    private double balance;

    public BankAccount() {
        balance = 10;
    }

    public void addDeposit(double deposit) throws NegativeDepositException{
        if (deposit < 0) throw new NegativeDepositException(deposit);
        else this.deposit += deposit;
    }
    public void addWithdrawal(double withdrawal) throws ExcessiveWithdrawalException{
        if (withdrawal > balance) throw new ExcessiveWithdrawalException(withdrawal, balance);
        else this.withdrawal += balance;
    }
}
