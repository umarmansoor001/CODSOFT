package Game;

import Game.GameComponents.GenerateRandomNumber;
import Game.GameComponents.NumberGame;
import Game.GameComponents.PresentGamePlayIntro;
import Game.GameComponents.PromptUserToInput;
import Game.GameComponents.TakeInputNumber;

public class GameStarter {

	private static NumberGame numberGame;
	
	public static void main(String[] args) {
		TakeInputNumber takeInputNumber = new TakeInputNumber();
		PresentGamePlayIntro presentGamePlayIntro = new PresentGamePlayIntro();
		GenerateRandomNumber generateRandomNumber = new GenerateRandomNumber();
		
		numberGame = new NumberGame(presentGamePlayIntro, takeInputNumber, generateRandomNumber);
		
		System.out.print(numberGame.Start());
	}
}
