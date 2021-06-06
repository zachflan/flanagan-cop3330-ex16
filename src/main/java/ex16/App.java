/*
 *  UCF COP3330 Summer 2021 Assignment 16 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex16;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner age = new Scanner(System.in);
        System.out.print("What is your age? ");
        String ageS = age.nextLine();
        int ageI = Integer.parseInt(ageS);

        String ternary = ageI > 15 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(ternary);
    }
}