package map;

import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.Map;

import rover.North;
import rover.Rover;

public class Planet {

	private Map<Coordinate, MapObjects> mars = new LinkedHashMap<Coordinate, MapObjects>();

	public Planet() {

		MapObjects objectInitialiser = new MapObjects(' ');
		for (int i = 0; i < 1600 && mars.size() != 1600; i++) {
			Coordinate coordinate = new Coordinate(new XCoordinate(i % 80), new YCoordinate(i / 80));
			objectInitialiser = objectInitialiser.generateRandomObject();
			mars.put(coordinate, objectInitialiser);
		}
		Coordinate roverCoordinates = new Coordinate(new XCoordinate(40), new YCoordinate(10));
		mars.replace(roverCoordinates, new Rover(' ', new North(), roverCoordinates));
	}

	private Coordinate findThisRover(Rover rover) {

		Rover Temp = new Rover(' ', new North(), null);
		int counter = 0;
		Coordinate coordinate = null;
		for (; counter < mars.size() && !rover.equals(Temp); counter++) {
			coordinate = new Coordinate(new XCoordinate(counter % 80), new YCoordinate(counter / 80));
			Temp = new Rover(' ', new North(), coordinate);
		}
		return coordinate;
	}

	private boolean obstacleAvailable(Coordinate Coordinates) {

		MapObjects currentObject = mars.get(Coordinates);
		return currentObject.equals(new Obstacle('#'));
	}

	public Rover updateAndReturnRoverState(Rover currentRover, Rover nextRover) {

		if (!obstacleAvailable(findThisRover(nextRover))) {
			mars.replace(findThisRover(currentRover), new Ground(' '));
			mars.replace(findThisRover(nextRover), nextRover);
			currentRover = nextRover;
		}
		return currentRover;
	}

	public void print() {

		PrintStream out = new PrintStream(System.out);
		int counter = 0;
		for (MapObjects obj : mars.values()) {
			obj.print();
			counter++;
			jumpLine(out, counter);
			printEdge(out, counter);
		}
	}

	private void printEdge(PrintStream out, int index) {

		for (int i = 0; i < 80 && index == 1600; i++) {
			out.print("=");
		}
		if (index == 1600)
			out.println();
	}

	private void jumpLine(PrintStream out, int index) {
		if (index % 80 == 0 && index != 0)
			out.println();
	}
}
