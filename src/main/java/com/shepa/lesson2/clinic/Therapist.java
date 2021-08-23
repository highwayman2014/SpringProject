package com.shepa.lesson2.clinic;

public class Therapist implements Doctor{
    @Override
    public void heal() {
        System.out.println("You were healed by Therapist");
    }
}
