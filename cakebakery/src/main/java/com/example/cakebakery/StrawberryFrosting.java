package com.example.cakebakery;

import org.springframework.stereotype.Component;

//@Component
public class StrawberryFrosting implements Frosting {
    @Override
    public void getFrostingType() {
        System.out.println("Strawberry Frosting");
    }
}
