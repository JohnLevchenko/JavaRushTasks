package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1417КонвертерВалютыИсправленная;

public class USD extends Money {
    private double amount;
    public USD(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
