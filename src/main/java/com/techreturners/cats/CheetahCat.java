package com.techreturners.cats;

public class CheetahCat extends Wild {

    private final String EAT = "Zzzzzzz";

    @Override
    public String eat() {
        return EAT;
    }

    public CheetahCat() {
        super();
        this.sleep = true;
        this.height = 23;
        this.typeCat = "wild";
    }
}
