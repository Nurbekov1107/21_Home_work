package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Apta kundorunon bir kundu anglis tilde jazynyz je san turundo jazynyz: ");
        Days daysEnglish = Days.valueOf(scanner.next().toUpperCase());
        System.out.println(daysEnglish);

    }

}