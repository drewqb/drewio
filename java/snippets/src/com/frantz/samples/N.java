package com.frantz.samples;
import java.io.PrintStream;

public class N {
	static String L = "We're no strangers to love\nYou know the rules and so do I\nA full commitment's what I'm thinking of\nYou wouldn't get this from any other guy\nI just wanna tell you how I'm feeling\nGotta make you understand\n\n#\n^And if you ask me how I'm feeling\nDon't tell me you're too blind to see\n\n#\n#\n(Ooh, give you up)\n(Ooh, give you up)\n(Ooh)\n@ give, never gonna give\n(Give you up)\n(Ooh)\n@ give, never gonna give\n(Give you up)\n\n^\nI just wanna tell you how I'm feeling\nGotta make you understand\n\n#\n#\n#";
	static String C = "@ give you up\n@ let you down\n@ run around and desert you\n@ make you cry\n@ say goodbye\n@ tell a lie and hurt you\n";
	static String G = "Never gonna";
	static String V = "We've known each other for so long\nYour heart's been aching but\nYou're too shy to say it\nInside we both know what's been going on\nWe know the game and we're gonna play it\n";
	
	public static void main(String[] a) {
		PrintStream p = System.out;
		for (int i = 0; i < L.length(); i++) {
			char c = L.charAt(i);
			if (c == '#') {
				for (int j = 0; j < C.length(); j++) {
					char d = C.charAt(j);
					if (d == '@')
						p.print(G);
					else
						p.print(d);
				}
			} else if (c == '@')
				p.print(G);
			else if (c == '^')
				p.print(V);
			else {
				p.print(c);
			}
		}
		
	}
}
