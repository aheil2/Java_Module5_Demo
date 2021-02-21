package edu.wctc;

public class ExcessiveWithdrawalException extends Exception{
    public ExcessiveWithdrawalException(double withdrawal, double balance) {
        super("Withdrawal cannot be greater than balance.\nBalance: " + balance + "\nWithdrawal Attempt: " + withdrawal);
    }
}
