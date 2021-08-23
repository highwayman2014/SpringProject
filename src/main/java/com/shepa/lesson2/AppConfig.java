package com.shepa.lesson2;

import com.shepa.lesson2.clinic.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "doctor")
    public Doctor doctor() {
        if (Patient.targetDoctor == Doctors.Therapist) {
            return new Therapist();
        } else if (Patient.targetDoctor == Doctors.Surgeon) {
            return new Surgeon();
        } else {
            throw new IllegalArgumentException("No have doctor in clinic");
        }
    }

    @Bean(name = "reception")
    public Reception reception(Doctor doctor) {
        Reception reception = new Reception();
        reception.setDoctor(doctor);
        return reception;
    }

}
