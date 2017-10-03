import edu.ac.guitarlib.Board;
import edu.ac.guitarlib.Midi;

public class Guitar {
	int tension;
	Board board = new Board();

	Wire[] wire;
	Peg[] peg;

	public Guitar() {
		wire = new Wire[6]; //instantiating wire as an array
		peg = new Peg[6]; // instantiating peg as an array
		//an array of 6 strings (0-5)

		for (int i = 0; i < 6; i++) {
			wire[i] = new Wire(board, Midi.GUITAR_TABLE[i]); //initializing wire, giving them a value into the arrays

			peg[i] = new Peg(wire[i]); // passing the wire number 'i'  to the peg constructor
		}
	}

	public void pluck(int wireNum) {
		wire[wireNum - 1].pluck(); // calling the wire class in theory it is plucking the guitar
	}

	public void turn(int pegNum, int deltaTension) {
		peg[pegNum - 1].turn(deltaTension); //changing the amount in tension from peg.turn
	}
}
