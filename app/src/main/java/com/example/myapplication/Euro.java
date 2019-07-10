package com.example.myapplication;

public class Euro extends Currency {
    private int euros;
    private int cents;

    public Euro (int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public String getName() {
        return "EUR";
    }

    public int getAmt() {
        return(euros*100 + cents);
    }

    public int getEuros(){
        return euros;
    }

    public int getCents() {
        return cents;
    }

    public void printFormatted() {
        String euro = Integer.toString(euros);
        String cent = Integer.toString(cents);
        System.out.println("£" + euro + "." + cent);
    }
}
