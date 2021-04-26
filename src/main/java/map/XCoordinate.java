package map;

public class XCoordinate {

	private int x;

	public XCoordinate(int x) {
		this.x = x;
	}

	public XCoordinate incrementX() {
		if (x < 79)
			return new XCoordinate(x + 1);
		return null;
	}

	public XCoordinate decrementX() {
		if (x > 0)
			return new XCoordinate(x - 1);
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		XCoordinate other = (XCoordinate) obj;
		return other.x == x;
	}

}
