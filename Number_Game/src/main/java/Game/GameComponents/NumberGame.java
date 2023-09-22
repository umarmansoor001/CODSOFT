package Game.GameComponents;

public class NumberGame {
	private PresentGamePlayIntro gameIntro;
	private TakeInputNumber inputNumber;
	private GenerateRandomNumber generateRandomNumber;
	
	private final static int score_increment = 20;
	
	private int Score;

	public NumberGame(PresentGamePlayIntro presentGamePlayIntro, TakeInputNumber takeInputNumber, GenerateRandomNumber generateRandomNumber){
		this.gameIntro = presentGamePlayIntro;
		this.inputNumber = takeInputNumber;
		this.generateRandomNumber = generateRandomNumber;
	}
	
	public String Start() {
		gameIntro.Display_GamePlay_Intro();
		this.Startround();
		return EndGame();
	}
	
	private void Startround() {
		int rand_number = generateRandomNumber.generateRandomNumber();
		int input_number = inputNumber.getInputNumber();
		boolean result = chk_guess(rand_number, input_number);
		ScoreCalculator(result);
		
	}
	
	private boolean chk_guess(int rand_number, int guess_number) {
		if(rand_number - guess_number < 20 && rand_number - guess_number > -20)
			return true;
		
		return false;
	}
	
	private int getScorePoints(boolean result) {
		if(result)
			return score_increment;
		
		return 0;
	}
	
	private void ScoreCalculator(boolean result) {
		Score = getScorePoints(result);
	}
	
	private String EndGame() {
		String EndingMessage ="****** Game Over ******* \n"
				+ " Your Score:- " + Score;
		
		return EndingMessage;
	}
}
