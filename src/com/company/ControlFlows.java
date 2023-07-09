package com.company;

public class ControlFlows<number> {

    public static void main(String[] args) {

        int a = 0;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        int num = 1;
        int sum = 0;
        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("The sum is " + sum);
        int b = 11;
        do {
            System.out.println(b);
        }
        while (b <= 10);


        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }


        int number = 10;

        if(number % 2 == 0){
            System.out.println(number + "is even number");
        }
        else {
            System.out.println(number + " is odd number");
        }

        int c=15;
        switch (c){
            case 5:
                System.out.println("Vrednosta e 5");
                break;
            case 10:
                System.out.println("Vrednosta e 10");
                break;
            case 15:
                System.out.println("Vredosta e 15");
                break;
            case 20:
                System.out.println("Vrednosta e 20");
            default:
                System.out.println("Vrednosta ne e pronajdena");


        }
    }






}





