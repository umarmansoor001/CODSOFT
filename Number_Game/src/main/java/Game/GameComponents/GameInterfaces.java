package Game.GameComponents;

interface GenerateRandomNumberInterface {
	
	public int generateRandomNumber();
}

interface PresentGamePlayIntroInterface {
	void Display_GamePlay_Intro();
}

interface TakeInputNumberInterface {
	int getInputNumber();
}

final class Min_Max_values{
	public static final int minNumber = 1;
	public static final int maxNumber = 100;
}