package edu.wctc;

public class NegativeDepositException extends Exception{
    public NegativeDepositException(double deposit) {
        super("Deposit cannot be negative: " + deposit);
    }
}
