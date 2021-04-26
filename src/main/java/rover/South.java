package rover;

import java.io.PrintStream;

import map.Coordinate;

public class South implements Direction {

	public Coordinate move(Coordinate roverCurrentCoordinate) {
		return roverCurrentCoordinate.coordinatesPlusY();
	}

	public Direction turn() {
		return new West();
	}

	public void print() {
		PrintStream out = new PrintStream(System.out);
		out.print("V");
	}
}
