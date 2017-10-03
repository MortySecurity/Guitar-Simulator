import edu.ac.guitarlib.Board;

public class Wire {
	int tension;
	Board board;

	public Wire(Board boardNew, int tensionNote) {
		tension = tensionNote;
		board = boardNew;
	}

	public void pluck() {
		board.soundNote(tension);
	}

	public void changeTension(int deltaTension) {
		tension += deltaTension; // updating the tension by delta time
	}
}
