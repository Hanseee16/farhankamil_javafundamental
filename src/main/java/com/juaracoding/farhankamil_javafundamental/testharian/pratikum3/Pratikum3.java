package com.juaracoding.farhankamil_javafundamental.testharian.pratikum3;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 08/11/2023 18:04
@Last Modified 08/11/2023 18:04
Version 1.0
*/

import java.util.Random;

public class Pratikum3 {
    public static void main(String[] args) {
        int lengthFirstAttempt = 21;
        String generatedStringFirstAttempt = generateRandomString(lengthFirstAttempt);
        System.out.println("Percobaan pertama\nOutput: " + generatedStringFirstAttempt);

        int lengthSecondAttempt = 13;
        String generatedStringSecondAttempt = generateRandomString(lengthSecondAttempt);
        System.out.println("\nPercobaan kedua\nOutput: " + generatedStringSecondAttempt);
    }

    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        String vowels = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";

        sb.append(Character.toUpperCase(vowels.charAt(random.nextInt(vowels.length()))));

        boolean isVowel = vowels.contains(sb.substring(0, 1).toLowerCase());
        for (int i = 1; i < 7; i++) {
            if (i % 2 == 0) {
                if (isVowel) {
                    sb.append(consonants.charAt(random.nextInt(consonants.length())));
                } else {
                    sb.append(vowels.charAt(random.nextInt(vowels.length())));
                }
            } else {
                if (isVowel) {
                    sb.append(vowels.charAt(random.nextInt(vowels.length())));
                } else {
                    sb.append(consonants.charAt(random.nextInt(consonants.length())));
                }
            }
        }

        for (int i = 7; i < length; i++) {
            if (random.nextBoolean()) {
                sb.append(vowels.charAt(random.nextInt(vowels.length())));
            } else {
                sb.append(consonants.charAt(random.nextInt(consonants.length())));
            }
        }

        return sb.toString();
    }
}

