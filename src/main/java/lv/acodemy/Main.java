package lv.acodemy;

public class Main {
    public static void main(String[] args) {

        // One-line comment

        /*
        This is
        multi-line comment
         */

        // Primitive data types

            //double floating number
            double pi = 3.14;
        System.out.println(pi);

            //float floating number
            float weight = 70.34f;
        System.out.println(weight);

            //int (integer)
            int populationOfLatvia = 1700000;
        System.out.println(populationOfLatvia);

            //char
            char myFirstNameChar = 'S';
        System.out.println(myFirstNameChar);

            // byte
            byte age = 24;
        System.out.println(age);

            // boolean (is, has)
            boolean isSummer = true;
        System.out.println(isSummer);

            boolean isWinter = false;
        System.out.println(isWinter);

            // String (text)
            String name = "Sofija";
            String surname = "Petenko";
        System.out.println(name + surname);
        // \n (break)
        System.out.printf("My name is: %s\nMy surname is: %s\n", name, surname);
        System.out.printf("%s %s\n", name, surname);

        System.out.println(String.format("My name is: %s. My surname is: %s",name,surname));

        //Operator
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);

        double d = 20.54;
        double e = 9.61;
        double f = d - e;
        System.out.println(f);
        System.out.println(a + b - e);

        // reminder
        int x = 10;
        int y = 10 % 3;
        System.out.println(y);

    }
}