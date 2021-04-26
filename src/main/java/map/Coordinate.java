package map;

public class Coordinate {

	private XCoordinate x;
	private YCoordinate y;

	public Coordinate(XCoordinate x, YCoordinate y) {
		this.x = x;
		this.y = y;
	}

	public Coordinate coordinatesPlusX() {
		if (x.incrementX() != null)
			return new Coordinate(x.incrementX(), y);
		return null;
	}

	public Coordinate coordinatesPlusY() {
		if (y.incrementY() != null)
			return new Coordinate(x, y.incrementY());
		return null;
	}

	public Coordinate coordinatesMinusX() {
		if (x.decrementX() != null)
			return new Coordinate(x.decrementX(), y);
		return null;
	}

	public Coordinate coordinatesMinusY() {
		if (y.decrementY() != null)
			return new Coordinate(x, y.decrementY());
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		Coordinate other = (Coordinate) obj;
		XCoordinate otherX = other.x;
		YCoordinate otherY = other.y;
		return x.equals(otherX) && y.equals(otherY);
	}

	@Override
	public int hashCode() {
		return x.hashCode() + y.hashCode();
	}
}