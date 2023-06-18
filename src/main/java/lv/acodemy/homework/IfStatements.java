package lv.acodemy.homework;

public class IfStatements {

    public static void main(String[] args) {

        /*Task: If Statement
        Write a program that checks if a given number is positive. If the number is positive, print "Number is positive."*/

        int x = 25;
        if (x > 0) {
            System.out.println("Number is positive");
        }

        /*Task: If-Else Statement
        Write a program that checks if a given number is even. If the number is even, print "Number is even." Otherwise, print "Number is odd."*/

        if (x % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

       /* Task: If-Else-If Statement
        Write a program that checks the temperature in Celsius and prints a corresponding message based on the temperature range:

        If temperature is less than 0, print "Freezing cold!"
        If temperature is between 0 and 15, print "Chilly weather."
        If temperature is between 16 and 25, print "Comfortable temperature."
        If temperature is above 25, print "Hot weather!"*/

        if (x < 0) {
            System.out.println("Freezing cold!");
        } else if (x >= 0 && x <= 15) {
            System.out.println("Chilly weather");
        } else if (x >= 16 && x <= 25) {
            System.out.println("Comfortable temperature");
        } else {
            System.out.println("Hot weather");
        }

        /*Task: If-Else Statement
        Write a program that checks if a given year is a leap year. If the year is a leap year, print "Leap year."
        Otherwise, print "Not a leap year."
        (A leap year is divisible by 4 but not divisible by 100, except if it is divisible by 400.)*/

        int year = 1700;
        boolean leap = false;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year");
        } else if (year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }


        /*Task: If Statement
        Write a program that checks if a given string is empty. If the string is empty, print "String is empty."*/

        String text = "";
        if (text.isEmpty()) {
            System.out.println("String is empty");
        }

    }
}

