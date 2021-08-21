package com.shepa.lesson2.clinic;

public class Surgeon implements Doctor{
    @Override
    public void heal() {
        System.out.println("You were healed by Surgeon");
    }
}
