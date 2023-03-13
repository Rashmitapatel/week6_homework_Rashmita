package week6Homework;

import java.util.Scanner;

/*a Java program that takes three numbers as input to calculate and
        print the average of the numbers.*/
public class averageofNumber13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int sum;
        int average;
        // int product;
        // int largest;
        // int smallest;

        System.out.print("Enter First Integer: ");
        num1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        num2 = input.nextInt();

        System.out.print("Enter Third Integer: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        average = sum / 3;
        System.out.println(average);
    }
}
