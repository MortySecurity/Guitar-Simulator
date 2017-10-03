import edu.ac.guitarlib.Board;

public class Peg { 	// Peg method
	Wire wire;

	public Peg(Wire stringMusic) { // Peg constructor
		this.wire = stringMusic;
	}

	public void turn(int deltaTension) { //turn method
		wire.changeTension(deltaTension); 
		/*
		 * wire.changeTension(deltaTension) im passing delta through peg to wire
		 * 
		 */
	}
}
