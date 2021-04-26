package rover;

import map.Planet;

public class Commands {

	private Rover rover;
	private Planet mars;

	public Commands(Rover rover, Planet mars) {
		this.rover = rover;
		this.mars = mars;
	}

	public void turn() {

		Rover currentRover = rover;
		rover = rover.expectedRoverAfterRotation();
		mars.updateAndReturnRoverState(currentRover, rover);
		mars.print();
	}

	public void move() {

		Rover currentRover = rover;
		rover = rover.expectedRoverAfterMovevement();
		rover = mars.updateAndReturnRoverState(currentRover, rover);
		mars.print();
	}
}
