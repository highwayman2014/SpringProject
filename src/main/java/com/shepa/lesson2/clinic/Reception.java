package com.shepa.lesson2.clinic;

public class Reception {

    Doctor doctor;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void help() {
        doctor.heal();
    }

}
