package rover;

import map.Coordinate;

public interface Direction {

	Coordinate move(Coordinate roverCurrentCoordinate);

	Direction turn();

	void print();
}
