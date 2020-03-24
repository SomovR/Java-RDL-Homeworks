package com.homework.taskone;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankUser userOne = new BankUser(bank, "User 1");
        BankUser userTwo = new BankUser(bank, "User 2");
        BankUser userThree = new BankUser(bank, "User 3");
        BankUser userFour = new BankUser(bank, "User 4");
        BankUser userFive = new BankUser(bank, "User 5");
        System.out.println("Initial money amount: " + bank.getMoneyAmount() + " EUR");
        Thread threadOne = new Thread(userOne);
        Thread threadTwo = new Thread(userTwo);
        Thread threadThree = new Thread(userThree);
        Thread threadFour = new Thread(userFour);
        Thread threadFive = new Thread(userFive);
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        threadFive.start();
    }
}