package org.example;

import jakarta.inject.Singleton;

import java.time.LocalDateTime;

@Singleton
public class DateTimeBean {

    public LocalDateTime getLocalDateTime() {
        return LocalDateTime.now();
    }
}
