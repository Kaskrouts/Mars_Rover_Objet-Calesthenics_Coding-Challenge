package Start;

import map.Coordinate;
import map.Planet;
import map.XCoordinate;
import map.YCoordinate;
import rover.Commands;
import rover.North;
import rover.Rover;

public class mainProgram {

	public static void main(String[] args) {
		Planet mars = new Planet();
		Rover rover = new Rover('^', new North(), new Coordinate(new XCoordinate(40), new YCoordinate(10)));
		Commands execute = new Commands(rover, mars);
		mars.print();

		execute.turn();
		execute.move();
		execute.move();
		execute.move();
		execute.move();
		execute.turn();
		execute.move();
		execute.move();
		execute.move();
		execute.move();
		execute.turn();
		execute.move();
		execute.move();
		execute.move();
		execute.move();
		execute.turn();
		execute.move();
		execute.move();
		execute.move();
		execute.move();

	}
}
