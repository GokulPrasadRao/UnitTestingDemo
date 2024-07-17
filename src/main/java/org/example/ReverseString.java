package org.example;

import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String ori) {
        StringBuilder str = new StringBuilder();
        str.append(ori);
        str.reverse();
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println("Enter any text");
        Scanner scanner = new Scanner(System.in);
        String ori = scanner.nextLine();
        String rev = reverseString(ori);
        System.out.println(rev);
    }
}
