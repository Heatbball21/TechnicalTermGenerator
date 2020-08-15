package Generator;

import java.util.Random;

public class Generator {

	Terms t = new Terms();
	Random r = new Random();
	int random;
	String s;
	
	
	public String getFirst(String[] f) {
		 random = r.nextInt(f.length);
		return f[random];
	}
	public String getSecond(String[] s) {
		random = r.nextInt(s.length);
		return s[random];
	}
	
	public String toString(String first, String second) {
		s = first + " the " + second;
		return s;
	}
	
	
	public String generate() {
		return toString(getFirst(t.first), getSecond(t.second));
	}
}
