package com.LickingHeights;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        testOddness();


    }



    public static void testOddness() {

        int pNumber = 12;

        System.out.println("testOddness");

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type a positive number");
        pNumber = keyboard.nextInt();


        System.out.println("Number is odd "+ (pNumber % 2 !=0));





    }
}
