package com.company;
import java.util.Scanner;

public class SH_03_Taking_Input {


        public static void main(String[] args) {
            System.out.println("Taking Input From the User");
            Scanner sc = new Scanner(System.in);           //(Read from the keyboard)
/*
            System.out.println("Enter number 1");
            int a = sc.nextInt();                       //(Method to read from the keyboard)
            float a = sc.nextFloat();
            System.out.println("Enter number 2");
            int b = sc.nextInt();
            float b = sc.nextFloat();
            int sum = a+b;
            float sum = a+b;
            System.out.println("The sum of these numbers is");
            System.out.println(sum);
            String str = sc.next();
            String str = sc.nextLine();
            System.out.println(str);
*/
            boolean b1 = sc.hasNextInt();
            System.out.println(b1);


        }
    }


