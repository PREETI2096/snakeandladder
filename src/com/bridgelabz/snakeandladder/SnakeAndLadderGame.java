package com.bridgelabz.snakeandladder;
import java.util.Random;
public class SnakeAndLadderGame {

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game program");
		 int position = 0;
		 System.out.println("position of single player is :" + position);
		 Random random = new Random();
		 int roll = 1 + random.nextInt(6);
		 System.out.println("after rolling dice position is:" + roll);
		 
		 int options = random.nextInt(3);
		 System.out.println("Option :" + options);
        
        switch (options) {
        case 0:
     	   System.out.println("Ladder i.e. move ahead!");
     	   position += roll ;
     	   break;
     	   
        case 1:
     	   System.out.println("snake i.e. please move back");
     	   position -= roll;
     	   if(position < 0)
     		   position = 0;
     	   break;
     	   
        default:
     	   System.out.println("No Play");
        }
        
        System.out.println("position of single player is = " + position);       
	}
}
