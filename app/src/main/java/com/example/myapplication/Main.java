package com.example.myapplication;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi!");
        Dollar d1 = new Dollar(5, 31);
        Dollar d2 = new Dollar(1, 92);
        Dollar d = new Dollar(1,37);

        Euro e1 = new Euro(1,20);

        System.out.println(e1.getEuros());
        System.out.println(e1.getCents());
        e1.printFormatted();
        System.out.println(e1.getAmt());

        /*
        System.out.println("pre " + d1.getDollars());
        d1.add(d2);
        System.out.println("add " + d1.getDollars());
        d1.subtract(d2);
        d1.subtract(d2);
        System.out.println("subtract " + d1.getDollars());
        d1.printFormatted();

        d.printCoins();
        */
    }

}
