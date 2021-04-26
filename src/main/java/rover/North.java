package rover;

import java.io.PrintStream;

import map.Coordinate;

public class North implements Direction {

	public Coordinate move(Coordinate roverCurrentCoordinate) {
		return roverCurrentCoordinate.coordinatesMinusY();
	}

	public Direction turn() {
		return new East();
	}

	public void print() {
		PrintStream out = new PrintStream(System.out);
		out.print("^");
	}
}
