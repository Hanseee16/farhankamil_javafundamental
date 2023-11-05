package com.juaracoding.farhankamil_javafundamental.testharian.pratikum1;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 05/11/2023 20:43
@Last Modified 05/11/2023 20:43
Version 1.0
*/

import java.util.Scanner;

public class Pratikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("(Input) Masukkan Kata: ");
        String input = scanner.nextLine();
        int totalAsciiSum = calculateNonAlphabeticAsciiSum(input);
        System.out.println("(Output) Hasil: " + totalAsciiSum);
    }

    public static int calculateNonAlphabeticAsciiSum(String input) {
        int sumAscii = 0;

        for (char character : input.toCharArray()) {
            int charAscii = (int) character;

            if (!(charAscii >= 97 && charAscii <= 122)) {
                sumAscii += charAscii;
            }
        }
        return sumAscii;
    }
}
