import org.asl.karelx.Squarebot;

import edu.fcps.karel2.Display;

/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
public class TestChallenge1 {

	public static void main(String[] args) {
		
		Display.openDefaultWorld();
		
		Squarebot squareBot = new Squarebot(9, 3);
		squareBot.layCorners(5);
		
		Sentry sentryBot = new Sentry(4, 3);
		sentryBot.patrol();
	}
}
