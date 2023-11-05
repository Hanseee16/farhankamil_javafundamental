package com.juaracoding.farhankamil_javafundamental.testharian.pratikum2;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 05/11/2023 20:23
@Last Modified 05/11/2023 20:23
Version 1.0
*/

import java.util.Scanner;

public class Pratikum2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int total = 0;
        int count = 0;

        System.out.println("Masukkan angka-angka sepuasnya. Ketik karakter selain angka (misalnya 'X') untuk menghitung rata-rata.");

        while (true) {
            try {
                System.out.print("Input: ");
                String input = inputScanner.nextLine();

                int number = Integer.parseInt(input);
                total += number;
                count++;
            } catch (NumberFormatException e) {
                break;
            }
        }

        if (count > 0) {
            double average = (double) total / count;
            System.out.println("Rata-rata: " + average);
        } else {
            System.out.println("Tidak ada angka yang dimasukkan.");
        }
    }
}
