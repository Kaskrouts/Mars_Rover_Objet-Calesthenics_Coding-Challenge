package rover;

import map.Coordinate;
import map.MapObjects;

public class Rover extends MapObjects {

	private Direction roverDirection;
	private Coordinate roverCoordinate;

	public Rover(char appearance, Direction roverDirection, Coordinate roverCoordinate) {
		super(appearance);
		this.roverCoordinate = roverCoordinate;
		this.roverDirection = roverDirection;
	}

	public Rover expectedRoverAfterMovevement() {
		return new Rover(' ', roverDirection, roverDirection.move(roverCoordinate));
	}

	public Rover expectedRoverAfterRotation() {
		return new Rover(' ', roverDirection.turn(), roverCoordinate);
	}

	public void print() {
		roverDirection.print();
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Rover))
			return false;
		Rover other = (Rover) obj;
		Coordinate otherRoverCoordinate = other.roverCoordinate;
		Direction otherRoverDirection = other.roverDirection;
		if (otherRoverCoordinate == null)
			return false;
		return otherRoverCoordinate.equals(roverCoordinate) || otherRoverDirection.equals(roverDirection);
	}
	// concerning the equals method :
	// Rover is a separate object. it can be defined with its location or
	// orientation
}
