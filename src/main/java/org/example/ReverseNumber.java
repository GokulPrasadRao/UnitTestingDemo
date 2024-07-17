package org.example;

import java.util.Scanner;

public class ReverseNumber {

    public static int reverse (int ori){
        int temp, rev = 0;
        while (ori != 0){
            temp = ori % 10;
            rev = rev * 10 + temp;
            ori = ori / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ori = scanner.nextInt();
        int rev = reverse(ori);
        System.out.println(rev + " This is the reversed number");
    }
}
