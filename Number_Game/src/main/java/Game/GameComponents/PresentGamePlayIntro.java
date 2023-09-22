package Game.GameComponents;

public class PresentGamePlayIntro implements PresentGamePlayIntroInterface{

	@Override
	public void Display_GamePlay_Intro() {
		
		for(int i = 0; i < 50; i++)
			System.out.print("*");
		System.out.println();
		
		System.out.print("            ");
		System.out.println("Game Play Instructions");
		
		for(int i = 0; i < 50; i++)
			System.out.print("*");
		System.out.println();
		System.out.println();
		
		System.out.println("->      Number Game is very Fun");
		System.out.println("->      In this Game, Computer generates a random number and You have to guess");
		System.out.println("->      If your Guess is correct you will get 100 points");
		System.out.println("->      If your Guess is close to Number you will get 20 points");
		System.out.println("->      If your Guess is either too low or too high then no points will award");
		System.out.println("->      You will have 5 attempts in each round");
		System.out.println("->      You can select the number of rounds of your choice");
		System.out.println("->      After the completion of Game, Score will display and a message of 'Game Over' ");
		
	}

}
