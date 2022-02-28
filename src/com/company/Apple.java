package com.company;

public class Apple extends Fruit {
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

    public Apple (boolean hasFlesh, boolean hasSeeds, String color, String taste, int glycemicIndexNum) {
        this.setHasFlesh(true);
        this.setHasSeeds(true);
        this.color = color;
        this.taste = taste;
        this.glycemicIndexNum = glycemicIndexNum;
    }

    public void printDetails() {
        System.out.println("An Apple is a fruit because hasSeeds is " + getHasSeeds()
        + ". The Apple hasFlesh is " + getHasFlesh() + ". \n" +
                "The Apple is " + color + ", " + taste  +
                ", and has a glycemic Index of " + glycemicIndexNum);
    }
}
