package week6Homework;

import java.util.Scanner;

/*a Java program to convert a given string into lowercase.
        Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        Output: the quick brown fox jumps over the lazy dog.*/
public class UtoLcase19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String:  ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
