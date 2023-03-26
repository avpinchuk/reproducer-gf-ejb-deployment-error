package org.example;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.time.LocalDateTime;

@Stateless
public class ExampleBean {

    private DateTimeBean dateTime;

    public ExampleBean(int i) { }

    @Inject
    public ExampleBean(DateTimeBean dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getLocalDateTime() {
        return dateTime.getLocalDateTime();
    }
}
