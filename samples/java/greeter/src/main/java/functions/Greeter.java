package functions;

import java.util.function.Function;

public class Greeter implements Function<String, String> {

	public String apply(String name) {
		//returns the name-game on the passed in String
		String suffix = name.substring(1);
		String song = name + ", " + name + ", bo-b" + suffix;
		song = song + " Banana-fana fo-f" + suffix;
		song = song + " Fee-fi-fo-m" + suffix;
		song = song + "... " + name.toUpperCase() + "!";

		return song;

	}
}
