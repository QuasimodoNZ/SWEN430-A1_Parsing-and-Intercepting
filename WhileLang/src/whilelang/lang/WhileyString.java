/**
 * 
 */
package whilelang.lang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Benjamin Riddell
 *
 */
public class WhileyString extends ArrayList<Character> {

	public WhileyString(List<Character> list) {
		super(list);
	}

	static public WhileyString asWhileyString(String s) {
		List<Character> list = new ArrayList<Character>(s.length());
		for (char c : s.toCharArray())
			list.add(c);
		return new WhileyString(list);
	}

	@Override
	public String toString() {
		String s = "";
		for (Character c : this) {
			s += c;
		}
		return s;
	}

}
