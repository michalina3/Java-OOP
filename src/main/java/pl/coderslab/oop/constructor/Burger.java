package pl.coderslab.oop.constructor;

public class Burger {
    private int size;
    private double price;

    public Burger(int size, double price){
            this.size = size;
            this.price = price;
    }
    public Burger(){
        this.size = 1;
        this.price = 1.0;
    }
}
