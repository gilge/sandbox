package com.gilge.testing;

public class Suz722 {

    public String play(int number) {

        if (number == 2) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 2) return "Suz";
        if (number % 5 == 3) return "722";


        return String.valueOf(number);
    }
}
