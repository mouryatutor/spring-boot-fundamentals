package com.assignment.student.info;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.stereotype.Component;

import javax.sound.midi.MidiDevice.Info;

import org.springframework.boot.actuate.info.InfoContributor;

@Component
public class CustomInfo implements InfoContributor {

    @Override
    public void contribute(Builder builder) {
        builder.withDetail("Application", "Student Application");
        builder.withDetail("Author", "Ratan Mourya");
    }
    
}
