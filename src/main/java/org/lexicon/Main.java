package org.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
    public static int runMenu(){
        Scanner keyboard = new Scanner(System.in);
        int choice = 0 ;
        System.out.println("\n\n Tryck på vald produkt:"
                + "\n1: Marabou \t 25Kr"
                + "\n2: Kakor \t 30Kr"
                + "\n4: Sour cream chips \t 20"
                + "\n5: Exit ");
        choice = keyboard.nextInt();
        return choice;
        } }