package com.example.tip2;

import java.util.Random;

public class Dice {
    Random r = new Random();

    public int roll() {
        for (int i = 0; i <= 3; i++) {
            int randZeroToSix = r.nextInt(6);
            return randZeroToSix + 1;

        }
        return 0;
    }
}
