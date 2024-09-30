/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javamathclass;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author TMacRae2026
 */
public class JavaMathClass {
    
    private static final double C = 299792458.0;
    
    public static void main(String[] args) {
        //Each part of the prompt is divided into 5 methods
        part1();
        System.out.print("\n");
        part2();
        System.out.print("\n");
        part3();
        System.out.print("\n");
        part4();
        System.out.print("\n");
        part5();
    }
    
    static void part1(){
        Random rand = new Random();
        double randNumber = rand.nextInt(90);
        
        Sohcahtoa sohcahtoa = new Sohcahtoa(randNumber);
        sohcahtoa.printString();
    }
    
    static void part2() {
        Random rand = new Random();
        double randNumber = rand.nextInt(20);
        System.out.println("radius of a circle: " + randNumber);
        //uses PiR^2
        System.out.printf(" - area: %.3f%n", (Math.PI * (randNumber*randNumber)));
        //uses 4/3(PiR^3)
        System.out.printf(" - volume: %.3f%n", ((4.0 /3.0) * Math.PI * Math.pow(randNumber, 3)));
    }
    
    static void part3() {
        // Generate a random number between 100,000,000.0 and 1,000
        Random rand = new Random();
        double randomNumber = 1000.0 + (rand.nextDouble() * (100000000.0 - 1000.0));

        // Calculate the sqrt, naturalLog and log10
        double sqrt = Math.sqrt(randomNumber);
        double natLog = Math.log(randomNumber);
        double log10 = Math.log10(randomNumber);

        // Display the results rounded to 5 decimal places
        System.out.printf("Random Number: %.5f%n", randomNumber);
        System.out.printf(" - Square Root: %.5f%n", sqrt);
        System.out.printf(" - Natural Log: %.5f%n", natLog);
        System.out.printf(" - Log10: %.5f%n", log10);
    }
    
    static void part4() {
        Scanner scanner = new Scanner(System.in);

        //Get energy value
        System.out.print("Enter energy in joules: ");
        double energy = scanner.nextDouble();

        //Get number of decimal place
        System.out.print("Enter number of decimal places for mass: ");
        int decimalPlaces = scanner.nextInt();

        //Calculate mass (m = E / c^2)
        double mass = energy / Math.pow(C, 2);
        
        //Output
        String stringFormatter = "%." + decimalPlaces + "f%n";
        //System.out.println("Mass required to generate " + energy + " joules of energy: " + mass + " grams");
        String output = " - Mass requirede to generate " + energy + ": " + stringFormatter;
        System.out.printf(output, mass);
    }
    
    static void part5() {
        Scanner scanner = new Scanner(System.in);
        //Get number value
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        //Get power value
        System.out.print("Enter power: ");
        double power = scanner.nextInt();
        
        System.out.println(Math.pow(base, power));
        
    }
    
}

class Sohcahtoa {
    double number;
    
    public Sohcahtoa(double number) {
        this.number = number;
    }
    
    public void setNumber(double number) {
        this.number = number;
    }
    
    public void printString() {
        //Java.lang math class
        double sin = Math.sin(number);
        double cos = Math.cos(number);
        double tan = Math.tan(number);
        
        //Uses string formatting to always have 3 decimal places like the example had.
        System.out.println("The number is " + number);
        
        System.out.printf(" - sin: %.3f%n", sin);
        System.out.printf(" - cos: %.3f%n", cos);
        System.out.printf(" - tan: %.3f%n", tan);
    }
    
}
