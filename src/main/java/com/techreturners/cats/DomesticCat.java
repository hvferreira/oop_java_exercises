package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends Type {

    private final int NUMPHRASES = 2;
    private final String[] EAT = {"Purrrrrrr", "It will do I suppose"};

    @Override
    public String eat() {
        return EAT[new Random().nextInt(NUMPHRASES)];
    }

    public DomesticCat() {
        super();
        this.sleep = false;
        this.height = 23;
        this.typeCat = "domestic";
    }
}
