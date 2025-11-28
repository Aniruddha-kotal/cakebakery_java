package com.example.cakebakery;

import org.springframework.stereotype.Component;

@Component
public class ChocolateSyrup implements Syrup{
    @Override
    public void getSyrupType() {
        System.out.println( "Chocolate Syrup");
    }
}
