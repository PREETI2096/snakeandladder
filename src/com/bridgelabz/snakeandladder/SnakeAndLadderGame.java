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
	}
}
