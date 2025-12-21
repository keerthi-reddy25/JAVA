package basic;

import java.util.TreeMap;

/*TreeMap:
 * 
 * predefined lass in java.util-->jdk 1.4
 * maintains the sorted order(i.e,sorting based on key in ascending order)
 * underlined ds-->Binary Tree
 * 
 */
public class ExampleForTreeMap {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put("Name","luffy");
		tm.put("Age",21);
		tm.put("email","luffy@gmail.com");
		System.out.println(tm);
		System.out.println("-------");
		for(Object i:tm.keySet()) {
			System.out.println(i);
		}
		System.out.println("---------");
		for(Object j:tm.entrySet()) {
			System.out.println(j);
		}

	}

}
