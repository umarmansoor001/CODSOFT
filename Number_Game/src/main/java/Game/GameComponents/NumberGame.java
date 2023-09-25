package Game.GameComponents;

public class NumberGame {
	private PresentGamePlayIntro gameIntro;
	private TakeInputNumber inputNumber;
	private GenerateRandomNumber generateRandomNumber;
	
	private final static int score_increment = 20;
	
	private int Score;
	private final int number_of_attempts = 5;
	private int used_attempts;
	
	public NumberGame(PresentGamePlayIntro presentGamePlayIntro, TakeInputNumber takeInputNumber, GenerateRandomNumber generateRandomNumber){
		this.gameIntro = presentGamePlayIntro;
		this.inputNumber = takeInputNumber;
		this.generateRandomNumber = generateRandomNumber;
		
	}
	
	public String Start() {
		Score = 0;
		this.used_attempts = number_of_attempts;
		gameIntro.Display_GamePlay_Intro();
		this.Startround();
		return EndGame();
	}
	
	private void Startround() {
		
		// loops runs till number of attempts
		while(used_attempts > 0) {
			System.out.println("************ Round " + (number_of_attempts - used_attempts + 1) + " Started " + "**************");
			
			int rand_number = generateRandomNumber.generateRandomNumber();
			int input_number = inputNumber.getInputNumber();
			boolean result = chk_guess(rand_number, input_number);
			ScoreCalculator(result);
			--used_attempts;
		}
		System.out.println("************ Round Completed **************");
			
	}
	private void chk_guessStatus(int difference) {
		if(difference < -20 )
			System.out.println("*********** Too Low **************");
		else if(difference > 20)
			System.out.println("*********** Too High *************");
		else if (difference == 0){
			System.out.println("*********** Correct **************");
			System.out.println();
			System.out.println("*********** You Won **************");
			System.out.println();
			used_attempts = 0;
			Score = 100;
			}
		else 
			System.out.println("*********** Too Close ***********");
		
		System.out.println(difference);
	}
	private boolean chk_guess(int rand_number, int guess_number) {
		chk_guessStatus(rand_number - guess_number);
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
		Score += getScorePoints(result);
	}
	
	private String EndGame() {
		String EndingMessage ="************ Game Over ************** \n"
				+ " Your Score:- " + Score;
		
		return EndingMessage;
	}
}
