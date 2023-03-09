import java.util.Random;
import java.util.Scanner;

class Game {

	public int number;
	public int inputNumber;
	public int noOfGuesses = 0;

	public int getNoOfGuesses() {
		return noOfGuesses;
	}

	public void setNoOfGuesses(int noOfGuesses) {
		this.noOfGuesses = noOfGuesses;
	}

	Game() {
		Random ran = new Random();
		this.number = ran.nextInt(100);
	}

	void takeUserInput() {
		System.out.println("Guess the number: ");
		Scanner sc = new Scanner(System.in);
		inputNumber = sc.nextInt();
	}

	boolean isCorrectNumber() {
		noOfGuesses++;
		if (inputNumber == number) {
			System.out.println("yes you guessed right number , it was " + number + " ....you guessed it in "
					+ noOfGuesses + " attempts.");
			return true;
		} else if (inputNumber < number) {
			System.out.println("Low number...");
		} else if (inputNumber > number) {
			System.out.println("High number...");
		}
		return false;
	}
}

public class number_guess {

	public static void main(String[] args) {
		Game g = new Game();
		boolean b = false;

		while (!b) {
			g.takeUserInput();
			b = g.isCorrectNumber();
		}
	}

}
