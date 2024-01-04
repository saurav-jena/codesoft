package codesoft;
import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		//generating random number
		Scanner sc=new Scanner(System.in);
		
	
		int attempts=5;
		int score=0;
		do {
			
			int  max=100;      //1
			int min=1;
			int range =(max-min)+1;
			int random1=(int)(Math.random()*range)+ min;
			int attemptsleft=attempts;
			
			System.out.println("guess the number");
			int guess=sc.nextInt();
			
			while(attempts>0){
				
				System.out.println("attempts left"+attemptsleft);
				if(guess==random1) {
					System.out.println("guess was correct");
					score++;
					break;
				}
				else if(guess>random1) {
					System.out.println("guess was too high");
				}
				else if(guess<random1) {
					System.out.println("guess was too low");
				}
				attemptsleft--;	
			}
			if(attempts==0) {
				System.out.println("you ran out of attempts");
			}
				System.out.println("your score is "+score);
				System.out.println("want to play again ? (yes/no)");
			
		}
		while(sc.next().equalsIgnoreCase("yes"));	
			
		System.out.println("thanks for playing the game "+score);
	}

}
