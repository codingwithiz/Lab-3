/*
Question 2
Author: Lee Ing Zhen 22055760
 */
package l3q2;
import java.util.Random;

/**
Generate a random integer within 0 to 5 and display the integer in word
 */
public class L3Q2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 6;
        int lowerbound = 0;
        
        int intrand = rand.nextInt(lowerbound,upperbound);
        
        switch(intrand){
            case 0: 
                System.out.println(intrand + " is zero");
            break;
            
            case 1:
                System.out.println(intrand + " is one");
            break;
            
            case 2: 
                System.out.println(intrand + " is two");
            break;
            
            case 3:
                System.out.println(intrand + " is three");
            break;
            
            case 4:
                System.out.println(intrand + " is four");
            break;
            
            case 5:
                System.out.println(intrand + " is five");
            break;   
            
               
        }
    }
    
}
