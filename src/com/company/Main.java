package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter letter:");
        char ch = input.next().charAt(0);
        System.out.println("Enter number:");
        int num = input.nextInt();
        for (int i=0; i<num; i++) {
            System.out.print(ch);
            ch--;
        }
    }
}
