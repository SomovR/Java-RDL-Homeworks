package com.homework.taskone;

import java.util.Random;

public class BankUser implements Runnable {
    private Bank bank;
    private String bankUserName;

    public BankUser(Bank bank, String bankUserName) {
        this.bank = bank;
        this.bankUserName = bankUserName;
    }

    @Override
    public void run() {
        while (bank.hasEnoughMoney((bank.getMoneyAmount()))) {
            try {
                Thread.sleep(new Random().nextInt(50));
                int amount = new Random().nextInt(50) + 1;
                System.out.println("Bank user " + bankUserName + " takes " + amount + " EUR");
                bank.transferMoney(amount);
                System.out.println("Remaining money amount: " + bank.getMoneyAmount() + " EUR");
            } catch (IllegalArgumentException | InterruptedException e) {
                System.out.println(e.toString());
                break;
            }
        }
    }
}

