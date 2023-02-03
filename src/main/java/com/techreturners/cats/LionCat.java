package com.techreturners.cats;

public class LionCat extends Wild {

    private final String EAT = "Roar!!!!";

    @Override
    public String eat() {
        return EAT;
    }

    public LionCat() {

        super();
        this.sleep = true;
        this.height = 1100;
        this.typeCat = "wild";
    }
}
