package lv.acodemy.homework;

public class PezDispenserSimpsons {
    public static void main(String[] args) {

        PezDispenser homer = new PezDispenser("Homer", "yellow", "The Simpsons");
        System.out.println(homer); //automatically calls homer.toString()

       homer.dispense(1);
        System.out.println(homer);

       homer.dispense(4);
        System.out.println(homer);

        homer.dispense(19);

       homer.load(1);
        System.out.println(homer);

        homer.load(33);

       homer.loadCompletely();
        System.out.println(homer);



    }
}
