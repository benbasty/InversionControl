package com.springprojects.inversioncontrol;

import org.springframework.stereotype.Component;

@Component
public class CookingJob implements ManageCooking {

    @Override
    public String doSomeCooking() {
        return "do some cooking actually";
    }
}
