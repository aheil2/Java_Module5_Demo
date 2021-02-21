package edu.wctc;

import java.math.BigDecimal;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


//        runBankExceptions();
//        printRandomNumbers();
//        printLocalDates();
//        printBigDecimals();
    }
    public static void runBankExceptions() {
        BankAccount myAccount = new BankAccount();
        try {
            myAccount.addDeposit(-10);
        } catch (NegativeDepositException e) {
            System.out.println(e.getMessage());
        }
        try {
            myAccount.addWithdrawal(11);
        } catch (ExcessiveWithdrawalException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void printBigDecimals() {
        double num1 = 34.56789876;
        double num2 = 34.2234;
        double sum1 = num1 + num2;
        System.out.println(sum1);

        BigDecimal bd1 = new BigDecimal("34.56789876");
        BigDecimal bd2 = new BigDecimal("34.2234");
        BigDecimal sum2 = bd1.add(bd2);
        System.out.println(sum2);
        System.out.println(sum2);
    }
    public static void printLocalDates() {
        //STATIC METHODS ARE IN ITALICS
        LocalDate otherDay = LocalDate.of(2006, 6, 6);
        LocalDate today = LocalDate.now();
        System.out.println(otherDay);
        System.out.println(today);

        //hour, minute, second, nanosecond
        LocalTime time1 = LocalTime.of(13, 46);
        LocalTime time2 = LocalTime.of(13, 46, 20);
        LocalTime time3 = LocalTime.of(13, 46, 20, 666);

        LocalDateTime dt1 = LocalDateTime.of(otherDay, time1);
        System.out.println("LocalDateTime: " + dt1);
        //LocalDateTime dt2 = LocalDateTime.

        //Extract LocalDate or LocalTime
        //LocalDate date = dateTime.ToLocalDate();

        //Duration: Time distance between 2 temporal objects
        //can accept 2 LocalTimes, 2 LocalDateTimes, OR 2 Instants


        //Period Object: accepts only 2 LocalDates (USE FOR LAB!)
        Period daysBetween = Period.between(otherDay, today);
        System.out.println(daysBetween.getDays());

        //Formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, YYYY");
        //before formatter
        System.out.println(today);
        //after formatter
        System.out.println(today.format(formatter));
    }
    public static void printRandomNumbers() {
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            int number = rn.nextInt(6) + 5;
            System.out.println(number);
        }

        int numPos = 5, minValue = 5;
        for (int i = 0; i < 10; i++) {
            double num = Math.floor(Math.random() * numPos) + minValue;
            System.out.println((int) num);
        }
    }
}
