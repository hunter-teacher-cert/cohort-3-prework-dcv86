import java.util.Scanner;

public class Celsius {

    public static void main(String[] args) {
			  double FH, CEL;
				
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("What's the tempeture in Fahrenheit? ");
        FH = in.nextDouble();

        // convert and output the result
        CEL = ((FH-32)*5/9);
				//remainder = inches % IN_PER_FOOT;
        System.out.printf("The tempeture: %.2f FH is equal to %.2f CEL",
                          FH, CEL);

		}
}
