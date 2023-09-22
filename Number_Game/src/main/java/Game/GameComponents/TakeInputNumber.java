package Game.GameComponents;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TakeInputNumber implements TakeInputNumberInterface {

	private PromptUserToInput promptToInput; 
	@Override
	public int getInputNumber() {
		Scanner input = new Scanner(System.in);
		int number = -1;
		
		do{
			try {
				System.out.print(promptToInput.promptToInput());
				number = input.nextInt();
				
				if (number < Min_Max_values.minNumber || number > Min_Max_values.maxNumber)
					throw new Exception();
			}
			catch(InputMismatchException e) {
				System.out.println("***** Kindly enter a Valid Number within range " + Min_Max_values.minNumber +" to " + Min_Max_values.maxNumber + " *****");
				input.next();
			}
			catch(Exception e) {
				System.out.println("***** Kindly enter a Valid Number within range " + Min_Max_values.minNumber +" to " + Min_Max_values.maxNumber + " *****");
				number = -1;
			}
		} while(number < Min_Max_values.minNumber || number > Min_Max_values.maxNumber);
		return number;
	}
	

}