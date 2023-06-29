package lv.acodemy.homework;

public class PezDispenser {

    private String name;
    private String color;
    private String series;
    private int pezCount = 13; //variable counts amount of Pez in dispenser
    private final int MAX_CAPACITY = 13;

    //constructor


    public PezDispenser(String name, String color, String series) {
        this.name = name;
        this.color = color;
        this.series = series;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSeries() {
        return series;
    }

    public int getPezCount() {
        System.out.println("I have " + pezCount + " candies inside");
        return pezCount;
    }

    //completely load dispenser
    public void loadCompletely() {
        this.pezCount = this.MAX_CAPACITY;
        System.out.println("Mmmm... Candies... ");
    }

    //load x candies into dispenser
    public boolean load(int x) {
        if (x >= 1 && pezCount + x <= MAX_CAPACITY) {
            pezCount += x;
            System.out.println("Mmmm... Candies...");
            return true;
        } else {
            System.out.println("D'oh! No candies for Homer");
            return false;
        }
    }


    //dispense y candies from dispenser
    public boolean dispense(int y) {
        if (y >= 1 && pezCount - y >= 0) {
            pezCount -= y;
            System.out.println("Why you little! Those are my candies, give them back!");
            return true;
        } else {
            System.out.println("Woo-hoo! Candies still mine!");
            return false;
        }
    }


    @Override
    public String toString() {
        return "PezDispenser " +  name + " contains " + pezCount + " candies";
    }
}





