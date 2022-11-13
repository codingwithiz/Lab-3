/*
Question 6
Author: Lee Ing Zhen 22055760
 */
package l3q6;
import java.util.Scanner;
/**
Write a program that asks users to enter the radius of a circle and a coordinate point 
(x, y). Determine whether the point is inside or outside the circle centered at (0, 0)
 */
public class L3Q6 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of a circle.");
		double radius = sc.nextDouble();
		double x,y;
		System.out.println("Enter a coordinate point (x,y)");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
	   double distance = Math.sqrt(((x-0)*(x-0))+((y-0)*(y-0)));
	   if (distance < radius)
		   System.out.println("The point is inside the circle.");
	   else if (distance == radius)
		   System.out.println("The point is on the circle.");
	   else
		   System.out.println("The point is out of the circle.");

    }
    
}
