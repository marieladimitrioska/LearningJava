package com.company;

public class Main {

    public static void main (String [] args) {

        AdvanceCalculator calc1 = new AdvanceCalculator();
       int add= calc1.add (5, 4);

        System.out.println("5+4="+ add);
        System.out.println( "10 - 5 = " + calc1.subtract(10, 5));

        double multiply= calc1.multiply(4, 5);
        System.out.println("4 * 5=" + multiply);

        double divide = calc1.divide(50, 3);
        System.out.println("50 / 3=" + divide);
        }
    BasicCalculator calc2 = new BasicCalculator();

}

