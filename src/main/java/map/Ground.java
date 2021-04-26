package map;

import java.io.PrintStream;

public class Ground extends MapObjects {

	public Ground(char appearance) {
		super(appearance);
	}

	public void print() {
		PrintStream out = new PrintStream(System.out);
		out.print(" ");

	}

}
