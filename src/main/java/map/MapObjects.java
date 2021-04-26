package map;

import java.util.Random;

public class MapObjects {

	private char appearance;

	public MapObjects(char appearance) {
		this.appearance = appearance;
	}

	public void print() {
	}

	public MapObjects generateRandomObject() {
		Random random = new Random();
		if (random.nextDouble() < 0.25)
			return new Obstacle('#');
		return new Ground(' ');
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + appearance;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		MapObjects other = (MapObjects) obj;
		return appearance == other.appearance;
	}

}
