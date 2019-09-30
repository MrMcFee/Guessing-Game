import java.util.Scanner;


public class GuessingGame {
	
	public GuessingGame() {
		
	boolean stillPlaying = true;
		
	int randomNum = (int)(Math.random() * 51);
	System.out.println(randomNum);
	int guessnum = 0;
	while (stillPlaying == true) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("You typed: " + input);
		int guess = Integer.parseInt(input);
		
		
	if (guess != randomNum) {
		
	
		if (guess < randomNum) {
			guessnum = guessnum + 1;
			System.out.println("Your guess was less than the number.");
			System.out.println("Guess again: ");
			
		}
		else if (guess > randomNum) {
			guessnum = guessnum + 1;
			System.out.println("Your guess was greater than the number.");
			System.out.println("Guess again: ");
		
		}
	
	}
		if (guess == randomNum) {
			guessnum = guessnum + 1;
			System.out.println("The number was: " + randomNum + ".");
			System.out.println("You guessed the number correctly!");
			System.out.println("Guesses:" + guessnum);
			System.out.println("Play again?");
			String yes = scan.nextLine();
			
				if (yes.equals("yes") || yes.equals("y")) {
					stillPlaying = true;
				}
				else {
					stillPlaying  = false;
				}
		}
		}	
	}

	
	
	
	
	public static void main(String[] args) {
		new GuessingGame();
	}

}
