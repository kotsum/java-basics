package lv.acodemy.classroom;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Loops {
    public static void main(String[] args) {

        //loops (циклы): for; do while; foreach; while

        //for (value; condition; counter)
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        String[] fruits = {"apple", "banana", "kiwi", "orange", "pear"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");

            Stream.of(fruits).forEach(System.out::println);
        }

        //enhanced for (for each)
        for (String fruit : fruits)
            System.out.println("fruit = " + fruit);

        // print number from 20 to 40
        for (int i = 20; i <= 40; i++) {
            System.out.println(i);
        }

        //calculate sum of all even numbers between 1 and 100

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers: " + sum);

        //print multiplication table of a given number

        int number = 6;
        for (int i = 0; i <= 10; i++) {
            System.out.print(i * number + " ");
        }
        // multiplication table for all numbers


        //while
        int i = 10;
        while (i > 0) {
            System.out.println("Hello World");
            i--;
        }

        int j = 0;
        while (j < 10) {
            System.out.println("Hello world");
            j++;
        }

        int k = 0;
        do {
            System.out.println("Hello World");
            k++;
        } while (k < 10);


        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(5);

        boolean isGuessed = false;
        while (!isGuessed) {
            System.out.println("Please enter number I guessed:");
            int inputNumber = myScanner.nextInt();
            if (randomNumber == inputNumber) {
                System.out.println("You guessed the number!");
                isGuessed = true;
            } else {
                System.out.println("Try again!");
            }

            //limit guess with 3 times

            //transform name

            String name = "Sofija";
            String reversed = "";
            for (int l = name.length() - 1; l >= 0; l--) {
                reversed = reversed + name.charAt(l);
            }
            System.out.println(reversed);


        }

    }
}