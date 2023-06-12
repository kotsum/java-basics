package lv.acodemy.classroom;

import java.util.Arrays;

public class ArraysIfs {
    public static void main(String[] args) {

        // array (массив)

        int[] numbers = {1, 5, 9, 10, 20, 30, 50}; //starting from 0 (0 = 1, 5 = 2, 10 = 3...)
        System.out.println(numbers[3]); //print 10

        int[] ages = new int[10];
        ages[0] = 18;
        ages[3] = 24;

        System.out.println(Arrays.toString(ages));

        // string array

        String[] names = {"John", "Andrew", "Marija", "Angelica"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]); //print Angelica

        // logical statements

        /*
        if(condition){

        }
        condition = boolean (true or false)
         */

        if (5 < 10) { //if true = go further
            System.out.println("Yes,this is correct!");

            boolean isSummer = true;
            if (isSummer) {
                System.out.println("Yes, this is summer and it's quite hot in here!");
            }

            int x = 10;
            if (x > 0) {
                System.out.println("Number is positive: " + x);
            }

            if (x % 2 == 0) { // == to compare variable
                System.out.println("Number can be divided by 2: " + x);
            }

            /*
            if(true) {
            do something}
            else {
            do something else
            }
             */

            if (x > 0) {
                System.out.println("Number is positive: " + x);
            } else {
                System.out.println("Number is negative: " + x);
            }

            if (x % 2 == 0) {
                System.out.println("Number is even!");
            } else {
                System.out.println("Number is odd!");
            }

            // <= less or equals
            // >= more or equals
            // == compare
            if (x < 18) {
                System.out.println("Person is not eligible to vote!");
            } else {
                System.out.println("Person is eligible to vote!");
            }

            boolean isWinter = false;
            boolean isAutumn = false;

            if (isSummer) { // find first "true"
                System.out.println("This is summer!");
            } else if (isWinter) {
                System.out.println("Right, this is winter!");
            } else if (isAutumn) {
                System.out.println("Right, this is autumn!");
            } else {
                System.out.println("Not sure, but it can be spring!");
            }
            int grade = 10;

            if (grade == 1) {
                System.out.println("Unsatisfactory");
            } else if (grade == 2) {
                System.out.println("Unsatisfactory");
            } else if (grade == 3) {
                System.out.println("Unsatisfactory");
            } else if (grade == 4) {
                System.out.println("Almost satisfactory");
            } else if (grade == 5) {
                System.out.println("Satisfactory");
            } else if (grade == 6) {
                System.out.println("Almost good");
            } else if (grade == 7) {
                System.out.println("Good");
            } else if (grade == 8) {
                System.out.println("Very good");
            } else if (grade == 9) {
                System.out.println("Excellent");
            } else if (grade == 10) {
                System.out.println("With distinction");
            } else {
                System.out.println("Incorrect value");
            }

            int angle = 90;
            if (angle > 0 && angle < 90) {
                System.out.println("Acute!");
            } else if (angle == 90) {
                System.out.println("Right!");
            } else if (angle > 90 && angle < 100) {
                System.out.println("Obtuse!");
            } else if (angle == 100) {
                System.out.println("Straight!");
            }
            else {
                System.out.println("Error!");
            }

            // do through cycle
            int[] numberarray = {5, 7, 18};
            int max;



        }
    }
}