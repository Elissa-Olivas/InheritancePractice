package com.company;

public class Banana extends Fruit {
    private String color;
    private String taste;
    private int glycemicIndexNum;

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public String getTaste() {
        return taste;
    }

    public void setGlycemicIndexNum(int glycemicIndexNum) {
        this.glycemicIndexNum = glycemicIndexNum;
    }
    public int getGlycemicIndexNum() {
        return glycemicIndexNum;
    }

    public Banana (boolean hasFlesh, boolean hasSeeds, String color, String taste, int glycemicIndexNum) {
        super(true, true);
        this.color = color;
        this.taste = taste;
        this.glycemicIndexNum = glycemicIndexNum;
    }

    public void printDetails() {
        System.out.println("A Banana is a fruit because hasSeeds is " + getHasSeeds()
                + ". The Banana hasFlesh is " + getHasFlesh() + ". \n" +
                "The Banana is " + color + ", " + taste  +
                ", and has a glycemic Index of " + glycemicIndexNum);
    }
}
