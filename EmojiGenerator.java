import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * A class that generates an emoji based on the user's mood rated from 1-10.
 * @author lmitzel2, pshah93
 *
 */
public class EmojiGenerator {
	/**
	 * Prints an emoji based on the user's input value.
	 */
	public static void giveMeEmoji() {
		final int max = 10;
		final int min = 1;
		int userInt;
		Scanner in = new Scanner(System.in);
		try {
		userInt = in.nextInt();
		while (userInt < min || userInt > max) {
			System.out.println("Please rate your mood from 1 to 10 (1 being low mood, and 10 being high mood).");
			userInt = in.nextInt();
		}
		if (userInt == 1 || userInt == 2) {
			System.out.println("          ");
			System.out.println(" ##    ## ");
			System.out.println(" ##    ## ");
			System.out.println(" ##    ## ");
			System.out.println("          ");
			System.out.println("          ");
			System.out.println("  ######  ");
			System.out.println(" ######## ");
			System.out.println("###    ###");
			System.out.println("##      ##");
		} else if (userInt == 3 || userInt == 4) {
			System.out.println("           ");
			System.out.println("  ###  ### ");
			System.out.println("  ###  ### ");
			System.out.println("  # #  # # ");
			System.out.println("           ");
			System.out.println("           ");
			System.out.println("     ###   ");
			System.out.println("   ####### ");
			System.out.println(" ##      ##");
		} else if (userInt == 5 || userInt == 6) {
			System.out.println("          ");
			System.out.println(" ##    ## ");
			System.out.println(" ##    ## ");
			System.out.println(" ##    ## ");
			System.out.println("          ");
			System.out.println("          ");
			System.out.println("          ");
			System.out.println("  ######  ");
			System.out.println("          ");
		} else if (userInt == 7 || userInt == 8) {
			System.out.println("          ");
			System.out.println(" ##    ## ");
			System.out.println(" ##    ## ");
			System.out.println(" ##    ## ");
			System.out.println("          ");
			System.out.println("          ");
			System.out.println("##      ##");
			System.out.println("###    ###");
			System.out.println(" ######## ");
			System.out.println("  ######  ");
		} else {
			System.out.println("          ");
			System.out.println(" ##    ## ");
			System.out.println(" ##    ## ");
			System.out.println(" ##    ## ");
			System.out.println("          ");
			System.out.println("          ");
			System.out.println("##########");
			System.out.println("##      ##");
			System.out.println(" ##    ## ");
			System.out.println("  ######  ");
		}
		} catch (InputMismatchException exc) {
			System.out.println("Incorrect input: an integer is required. Try again.");
			giveMeEmoji();
		}
		in.close();
	}
}
	
