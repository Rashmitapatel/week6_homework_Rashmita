package week6Homework;

import java.util.Scanner;

/* program to insert any temperature value in degree Fahrenheit and
      *  convert to degree Celsius ((F − 32) × 5/9 = 0°C).

 */
public class TempFer7 {
public static void main(String [] args){
    Scanner in = new Scanner(System.in); /*input temperature in Fahrenheit from user */
    System.out.println("Enter temreture in farenheit:");
    Float F = in.nextFloat();
    float C = (F - 32) * (9f / 5 ) ;/* Convert Fahrenheit to Celsius */
    System.out.println ( F+"degree farenheit is equal to"+ C +"degree Celsius");/* Print temperature in Celsius */
}

}
