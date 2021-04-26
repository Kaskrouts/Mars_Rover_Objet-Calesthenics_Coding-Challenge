package rover;

import java.io.PrintStream;

import map.Coordinate;

public class East implements Direction {

	public Coordinate move(Coordinate roverCurrentCoordinate) {
		return roverCurrentCoordinate.coordinatesPlusX();
	}

	public Direction turn() {
		return new South();
	}

	public void print() {
		PrintStream out = new PrintStream(System.out);
		out.print(">");
	}
}
