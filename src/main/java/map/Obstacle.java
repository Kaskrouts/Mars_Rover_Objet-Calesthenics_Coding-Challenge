package map;

import java.io.PrintStream;

public class Obstacle extends MapObjects {

	public Obstacle(char appearance) {
		super(appearance);
	}

	public void print() {
		PrintStream out = new PrintStream(System.out);
		out.print("#");
	}

}
