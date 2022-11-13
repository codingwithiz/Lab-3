/*
Question 4
Author: Lee Ing Zhen 22055760
 */
package l3q4;
import java.util.Random;

/**
Write a simple two players dice game. Each player will roll the dice twice and the 
player with the highest score wins the game. 
 */
public class L3Q4 {

    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 7;
        int lowerbound = 1;
        int sum1 = 0 ; 
        int sum2 = 0;
        System.out.println("Player 1 start to roll the dice 2 times now");
        int rand1 = rand.nextInt(lowerbound, upperbound);
        int rand2 = rand.nextInt(lowerbound, upperbound);
        
        sum1 = rand1 + rand2;
        System.out.println("Score of Player 1 is: " + sum1);
        
        System.out.println("Player 2 start to roll the dice 2 times now");
        int rand3 = rand.nextInt(lowerbound, upperbound);
        int rand4 = rand.nextInt(lowerbound, upperbound);
        
        sum2 = rand3 + rand4;
        System.out.println("Score of Player 2 is " + sum2);
        
        if(sum1>sum2){
            System.out.println("Player 1 wins");
            }
        else{
            System.out.println("Player 2 wins");
        }
           
        
    }
    
}
