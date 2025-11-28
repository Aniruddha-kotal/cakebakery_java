package com.example.cakebakery;

import org.springframework.stereotype.Component;

//@Component
public class StrawberrySyrup implements Syrup{
    @Override
    public void getSyrupType() {
        System.out.println("Strawberry Syrup");
    }
}
