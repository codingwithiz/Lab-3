/*
Question 5
Author: Lee Ing Zhen 22055760
 */
package l3q5;
import java.util.Scanner;
/**
Cramer’s rule is used to solve the linear equations.
ax + by = e, cx + dy = f; x = (ed-bf)/(ad-bc) y=(af-ec)/(ad-bc)
Write a program that ask the user to enter a, b, c, d, e, f. and display the result of x 
and y. If ad – bc is equal to 0. Display "The equation has no solution"
 */
public class L3Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        
        System.out.println("Enter b:");
        int b = sc.nextInt();
        
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        
        System.out.println("Enter d: ");
        int d = sc.nextInt();
        
        System.out.println("Enter e: ");
        int e = sc.nextInt();
        
        System.out.println("Enter f: ");
        int f = sc.nextInt();
        
        double x =0;
	        double y;
	        if ((a*d - b*c) == 0)
	        	System.out.println("The equation has no solution.");
	        	else	
	        x = (e*d-b*f) / (a*d-b*c);
	        y = (a*f - e*c) / (a*d - b*c);
	        System.out.println("x is " + x);
	        System.out.println("y is " + y);

    }
    
}
