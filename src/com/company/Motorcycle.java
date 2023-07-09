package com.company;

public class Motorcycle {

     String color;
     String model;
     boolean engeinState = false;

     void startEngine (){
         if (engeinState == true)
             System.out.println("The engine is already on.");
         else {
             engeinState= true;
             System.out.println("The engin is now on");
         }
     }

     void showAtts (){
         System.out.println("This motorcycle is a " + color + " " + model );
         if (engeinState == true)
             System.out.println("The engine is on.");
         else System.out.println("The engine is off.");
     }

     public static void main (String [] args) {
         Motorcycle motor = new Motorcycle();
         motor.model = "Yamaha";
         motor.color = "Red";
         System.out.println("Calling showAtts ...");
         motor.showAtts();
         System.out.println("------------------------------");
         System.out.println("Starting engine....");
         motor.startEngine();
         System.out.println("-------------------------------");
         System.out.println("Calling showAtts");
         motor.showAtts();
         System.out.println("---------------------------------");
         System.out.println("Starting engine...");
         motor.startEngine();

     }
}
