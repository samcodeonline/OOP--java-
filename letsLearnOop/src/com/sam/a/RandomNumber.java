package com.sam.a;

import java.util.Random;

public class RandomNumber {
    private static int generateConfirmationNumber() {
        // Generate a random 6-digit confirmation number
        Random rand = new Random();
        return rand.nextInt(900000) + 100000;
    }
    public static void main(String[] args) {
        int randomNumber = generateConfirmationNumber();
        System.out.println(randomNumber);
    }
}
