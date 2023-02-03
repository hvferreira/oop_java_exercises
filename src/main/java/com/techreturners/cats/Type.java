package com.techreturners.cats;

abstract class Type implements Cat {

    int height;//altura cm
    String typeCat; //domestico or wild
    boolean sleep; // dormir or acordado


    public Type() {
    }

    @Override
    public abstract String eat();

    @Override
    public boolean isAsleep() {
        return sleep;
    }

    @Override
    public void goToSleep() {
        sleep = true;
    }

    @Override
    public void run() {

    }

    @Override
    public String getSetting() {
        return typeCat;
    }

    @Override
    public int getAverageHeight() {
        return height;
    }

    @Override
    public void wakeUp() {
        sleep = false;
    }
}
