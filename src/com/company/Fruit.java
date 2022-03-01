package com.company;

public class Fruit {
    private boolean hasFlesh;
    private boolean hasSeeds;

    public Fruit (boolean hasFlesh, boolean hasSeeds) {
        this.hasFlesh = true;
        this.hasSeeds = true;
    }

    //    public void setHasFlesh(boolean hasFlesh) {
//        this.hasFlesh = hasFlesh;
//    }
    public boolean getHasFlesh() {
        return hasFlesh;
    }

    //    public void setHasSeeds(Boolean hasSeeds) {
//        this.hasSeeds = hasSeeds;
//    }
    public boolean getHasSeeds() {
        return hasSeeds;
    }


}
