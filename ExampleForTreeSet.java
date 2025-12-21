package basic;

import java.util.TreeSet;

//Treeset:
/*predefined class-->java.util
 * jdk 1.2
 * add-->Ts-->compareTo()
 
 */

public class ExampleForTreeSet {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(50);
		ts.add(10);
		ts.add(35);
		ts.add(70);
		System.out.println(ts);
	}
}
