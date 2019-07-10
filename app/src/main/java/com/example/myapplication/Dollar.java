package com.example.myapplication;

public class Dollar extends Currency {
    private int dollars;
    private int cents;

    public Dollar (int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public int getDollars() {
        return dollars;
    }
    public int getCents() {
        return cents;
    }

    public void add(Dollar other) {
        int total = (dollars*100)+cents+(other.getDollars()*100)+other.getCents();
        dollars = total/100;
        cents = total%100;
    }

    public void subtract(Dollar other) {
        int total = (dollars*100)+cents-((other.getDollars()*100)+other.getCents());
        dollars = total/100;
        cents = total%100;
    }

    public void printFormatted() {
        String dollar = Integer.toString(dollars);
        String cent = Integer.toString(cents);
        System.out.println("$" + dollar + "." + cent);
    }

    public void printCoins() {
        int quarters = this.dollars * 4;
        quarters += this.cents/25;
        int dimes = (this.cents%25)/10;
        int nickels = ((this.cents%25)%10)/5;
        int pennies = (((this.cents%25)%10)%5);
        System.out.println(quarters + " quarters " + dimes + " dimes " + nickels + " nickels " + pennies + " pennies ");
    }

    public String getName() {
        return "USD";
    }

    public int getAmt() {
        return(dollars*100 + cents);
    }
}
