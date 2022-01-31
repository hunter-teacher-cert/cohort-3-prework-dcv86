import java.util.Random;
import java.util.Scanner;
public class Guess {

    public static void main(String[] args) {
        // pick a random number
        int numberGuessed;
				
				Scanner in = new Scanner(System.in);

				Random random = new Random();
        int number = random.nextInt(100) + 1;

				

				
				System.out.println("I'm thinking of a number between 1 and 100, (including both). \nCan you guess what it is? ");
				System.out.print("Guess a number: ");
				numberGuessed = in.nextInt();
				System.out.println("Your guess is: "+numberGuessed);
				System.out.println("The number I was thinking of was: " + number);
				int offBy = Math.abs(numberGuessed - number);
				System.out.println("You were off by: " + offBy);



    }
}