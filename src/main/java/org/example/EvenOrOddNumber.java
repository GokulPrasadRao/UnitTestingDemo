package org.example;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static boolean evenOrOdd(int x) {
        boolean result ;
        if (x %2== 0){
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean result = evenOrOdd(x);
        System.out.println("The number is: " + result);
    }
}
