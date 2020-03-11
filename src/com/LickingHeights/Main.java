package com.LickingHeights;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        lastDigit();


    }



    public static void lastDigit() {
        Scanner
        Keyboard = new Scanner (System.in);
        int number = 2424;

        System.out.println("Type a positive four digit number");

        System.out.println("number contained is: " + (number%8)+5);

        System.out.println((number %8)+5);

        number = 1;
        System.out.println((number %8)+5);

        number = 2;
        System.out.println((number %8)+5);

        number = 3;
        System.out.println((number %8)+5);

        number = 4;
        System.out.println((number %8)+5);

        number = 5;
        System.out.println((number %8)+5);

        number = 6;
        System.out.println((number %8)+5);

        number = 7;
        System.out.println((number %8)+5);







    }
}
