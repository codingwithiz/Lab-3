/*
Question 1
Author: Lee Ing Zhen 22055760
 */
package l3q1;
import java.util.Scanner;
/**
Write a program that stimulates a simple calculator. It reads two integers and a 
character. If the character is a +, the sum is printed; if it is a -, the difference is 
printed; if is a *, the multiplication is printed; if it is a /, the quotient is printed; and if 
it is a %, the remainder is printed. (Use the String.charAt(0) to return the character)
 */
public class L3Q1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       String ope = "+-*/%";
       System.out.println("Enter two integer number: ");
       int x = sc.nextInt();
       int y = sc.nextInt();
       System.out.println("Enter the operand,");
       char operand = sc.next().charAt(0);
       int result;
       if(operand==ope.charAt(0)){
           result = x + y;
       }
       else if(operand==ope.charAt(1)){
           result = Math.abs(x-y);
       }
       else if(operand==ope.charAt(2)){
           result = x*y;
       }
       else if(operand==ope.charAt(3)){
           result = x/y;
       }
       else{
           result = x%y;
       }
       

       
       String n1 = Integer.toString(x);
       String n2 = Integer.toString(y);
       String total = Integer.toString(result);
       System.out.println(n1 + " " + operand + " " + n2 + " = " + total);
       
       
       
  
    
}
}
