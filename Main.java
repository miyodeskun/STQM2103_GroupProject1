package com.company;

import java.util.*;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("TOPIC 5: Division in the Integer: Prime Number and Prime Factorization"); // Menu
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Press 1 : Prime Number");
        System.out.println("Press 2 : Prime Factorization");

        char ch = 0;
        do {
            System.out.print("Choose 1 or 2  : "); // User can choose 1 or 2
            int choose = scan.nextInt();
            if (choose == 1) { // 1 for Prime Number determination
                System.out.println("\n1.Prime Number");
                System.out.println("------------");
                primeNumber();
                System.out.print("\nContinue to other equations? [Y/N]\n= ");
                ch = scan.next().charAt(0);


            } else if (choose == 2) { // 2 for Prime factorization
                System.out.println("\n2.Prime Factorization");
                System.out.println("-------------------");
                primeFactor();
                System.out.print("\nContinue to other equations? [Y/N]\n= ");
                ch = scan.next().charAt(0);
            }
            System.out.println("");

        } while ((ch == 'y') || (ch == 'Y'));

        System.out.println("Finish !");
    }

    private static void primeNumber() { //Method to determine integer number is prime or not.
        int i, m, flag = 0;
        char ch = 0;
        System.out.print("Enter Number  :: ");
        int n = scan.nextInt();
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is NOT prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is NOT prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        } //end of else

        System.out.print("\nSee solution? [S]\n= "); // Show solution for prime number determination
        ch = scan.next().charAt(0);
        if (ch == 's' || ch == 'S') {
            System.out.println(" ");
            if (n == 0 || n == 1) {
                System.out.println("If the input is 0 or 1, then it is NOT prime number.");
            } else if (flag == 0) {
                System.out.println("The result of " + n + " % 2 is not 0, then it is prime number.");
            } else if (flag == 1) {
                System.out.println("The result of " + n + " % 2 is equal 0, then it is NOT prime number.");
            }
        }
    }

    private static void primeFactor() { //Method to find prime number factorization
        char ch = 0;
        System.out.print("Enter a number ::");
        int number1 = scan.nextInt();
        int number = number1;
        for (int i = 2; i < number; i++) {

            while (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;

            }
        }
        if (number > 2) {
            System.out.println(number);
        }

        System.out.print("\nSee solution? [S]\n= "); // Show solution for prime factorization
        ch = scan.next().charAt(0);
        if (ch == 's' || ch == 'S') {
            for (int i = 2; i < number1; i++) {
                while (number1 % i == 0) {
                    System.out.print(number1 + " / " + i + " = ");
                    number1 = number1 / i;
                    System.out.println(number1 + ": Factor " + i);
                }
            }
                if (number1 > 2) {
                    System.out.print(number1 + " / " + number1 + " = ");
                    System.out.println("1" + ": Factor " + number1);
                }
        }
    }
}