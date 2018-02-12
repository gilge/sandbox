package com.techprimers.testing;

public class Suz722 {

    public String play(int number) {

        if (number == 2) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Suz";
        if (number % 5 == 0) return "722";


        return String.valueOf(number);
    }
}
