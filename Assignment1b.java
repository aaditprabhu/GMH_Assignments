/**
 * Assignment 1 Part b (Factorial)
 */

import java.util.*;

public class Assignment1b {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to Calculate the factorial:");
        int num = scan.nextInt();
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("The Factorial of "+ num +" is: " +fact);
    }
}
