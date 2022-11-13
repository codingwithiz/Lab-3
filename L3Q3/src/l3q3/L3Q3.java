/*
Question 3
Author: Lee Ing Zhen 22055760
 */
package l3q3;
import java.util.Scanner;

/**
Write a program that calculates the total commission receives based on the table 
below. The program will accept the sales volume and calculate the commission.
Display the commission in two decimal places.
 */
public class L3Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double commission;
        System.out.println("Enter sales volume: ");
        double sales_volume = sc.nextDouble();
        
        if(sales_volume<=100){
            commission = sales_volume*0.05;
        }
        else if(sales_volume>100 &&sales_volume<=500){
            commission = (sales_volume -100)*0.075 + (100*0.05);
        }
        else if (sales_volume>500 && sales_volume<=1000){
            commission = (sales_volume -500)*0.1 + (100*0.05) + (400*0.075);
        }   
        else{
            commission = (sales_volume-1000)*0.125 + (100*0.05) + (400*0.075)+ (500*0.1);
        }
        
        System.out.println("Commission = " + commission);
    }
      
    
    
}
