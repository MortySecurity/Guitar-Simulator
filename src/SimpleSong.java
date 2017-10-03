/*
 * Created by Mourtadah Karim
 */
import edu.ac.guitarlib.Midi;

public class SimpleSong {
	public static void main(String args[]) {
		Guitar guitar = new Guitar();
		for (int i = 0; i < 6; i++) {
			guitar.pluck(i + 1);
			Midi.pause(1); // pauses 1 second
		}
		Midi.pause(4); // pauses 4 seconds
		guitar.pluck(3);
		Midi.pause(2);
		guitar.turn(3, 2);
		guitar.pluck(3);
		Midi.pause(2);
		guitar.turn(3, 2);
		guitar.pluck(3);
		Midi.pause(2);
		guitar.turn(3, -4);
		guitar.pluck(3);
		Midi.pause(2);
		// guitar.close();
	}
}