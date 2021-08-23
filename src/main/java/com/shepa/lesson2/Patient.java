package com.shepa.lesson2;

import com.shepa.lesson2.clinic.Doctors;
import com.shepa.lesson2.clinic.Reception;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Patient {

    static Doctors targetDoctor = Doctors.Surgeon;

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Reception reception = context.getBean("reception", Reception.class);
        reception.help();

    }

}
