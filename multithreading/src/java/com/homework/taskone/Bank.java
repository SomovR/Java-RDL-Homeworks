package com.homework.taskone;

public class Bank {
    private int moneyAmount = 200;

    public synchronized void transferMoney(int amount) throws IllegalArgumentException {
        if (hasEnoughMoney(amount)) {
            moneyAmount -= amount;
        } else {
            throw new IllegalArgumentException("There are not enough money in the bank: " + amount);
        }
    }

    public boolean hasEnoughMoney(int amount) {
        return amount <= moneyAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }
}
