package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int randomInt = 700 + random.nextInt(800);
        System.out.println(randomInt);
    }
}
