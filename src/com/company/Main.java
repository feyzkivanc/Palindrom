package com.company;

public class Main {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastDigit;
        while (temp != 0) {
            System.out.println(temp);
            lastDigit = temp % 10;
            System.out.println(lastDigit);
            reverseNumber = (reverseNumber * 10) + lastDigit;
            System.out.println(reverseNumber);
            temp /= 10;
        }
        return reverseNumber == number;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(999));
    }
}
