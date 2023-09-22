
package Game.GameComponents;

import java.util.Random;



public class GenerateRandomNumber implements GenerateRandomNumberInterface{

	@Override
	public int generateRandomNumber() {
		Random rand = new Random();
		
		// range will be specific and in between maxNumber and minNumber
		// like in between 0 - 101 
		int random_number = rand.nextInt(Min_Max_values.maxNumber + Min_Max_values.minNumber); 
		System.out.print(random_number);
		
		return random_number;
	}

}

