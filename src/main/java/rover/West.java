package rover;

import java.io.PrintStream;

import map.Coordinate;

public class West implements Direction {

	public Coordinate move(Coordinate roverCurrentCoordinate) {
		return roverCurrentCoordinate.coordinatesMinusX();
	}

	public Direction turn() {
		return new North();
	}

	public void print() {
		PrintStream out = new PrintStream(System.out);
		out.print("<");
	}

}
