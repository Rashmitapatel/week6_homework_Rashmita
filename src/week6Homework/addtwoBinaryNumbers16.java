package week6Homework;

import java.util.Scanner;

/*a Java program to add two binary numbers.

        Input Data:
        Input first binary number: 10
        Input second binary number: 11
        Expected Output:

        Sum of two binary numbers: 101*/


public class addtwoBinaryNumbers16 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter first binary number :: ");

    // To take binray input you just need to write 2 as a base value
    int b1 = scan.nextInt(2);

    System.out.print("Enter second binary number :: ");
    int b2 = scan.nextInt(2);

    int result = b1 + b2;
    System.out.println(result);
}
}