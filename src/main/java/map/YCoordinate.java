package map;

public class YCoordinate {

	private int y;

	public YCoordinate(int y) {
		this.y = y;
	}

	public YCoordinate incrementY() {
		if (y < 19)
			return new YCoordinate(y + 1);
		return null;
	}

	public YCoordinate decrementY() {
		if (y > 0)
			return new YCoordinate(y - 1);
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		YCoordinate other = (YCoordinate) obj;
		return other.y == y;
	}
}
