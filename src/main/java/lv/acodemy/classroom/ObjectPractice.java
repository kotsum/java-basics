package lv.acodemy.classroom;

import javax.print.attribute.Size2DSyntax;

import static lv.acodemy.classroom.Sizes.*;

public class ObjectPractice {

    public static void main(String[] args) {

        Animal barsik = new Animal();
        String catName = barsik.getName();

        //name = null
        System.out.println(catName);
        System.out.println(barsik);

        //name = Barsiks
        barsik.setName("Barsiks");
        System.out.println(barsik);

        //age = 5;
        barsik.setAge(5);
        System.out.println("My cat is: " + barsik.getAge() + " years old.");

        //set data for weight, color, size (getter-setter)
        barsik.setColor("Black");
        System.out.println(barsik.getColor());

        barsik.setSize(S);
        System.out.println(barsik.getSize());

        barsik.setWeight(3.4);
        System.out.println(barsik.getWeight());

        System.out.println(barsik);

        //boolean

        Animal ballzik = new Animal(13, "Ballzik");
        //My name is Ballzik. I am 13 years old.
        System.out.printf("My name is %s. I am %d years old.\n", ballzik.getName(), ballzik.getAge());

        //create all argument constructor;
        Animal torture = new Animal(2, 1.3, "green", S, "Torture", false);
        System.out.println(torture);

        torture.speak();
        torture.getEnergy();
    }
}
