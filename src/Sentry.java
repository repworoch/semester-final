import org.asl.karelx.Uberbot;

import edu.fcps.karel2.Display;

/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {

	public Sentry() {
		
		super();
	}
	
	public Sentry(int x, int y) {
		
		super(x, y, Display.NORTH, Display.INFINITY);
	}
	
	/**
	 * Patrol an area in a clockwise direction.  
	 * 
	 * Move forward until next to a beeper then turn right.  Repeat indefinitely.
	 *
	 */
	public void patrol() {
		while (1 < 2) {
			super.move();
			while(!super.nextToABeeper()) {
				super.move();
			}
			
			super.turnRight();
		}
	}
}
