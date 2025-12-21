package basic;

import java.util.LinkedHashMap;

/*LinkedHashMap:
 * predefined class in java.util-->jdk 1.4
 * insertion order is maintained
 *underlined ds-->LinkedList HashTable
 */
public class ExampleForLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("Name","luffy");
		lhm.put("Age",21);
		System.out.println(lhm);
		System.out.println("-----------");
		System.out.println(lhm.get(0));
		System.out.println("----------");
		for(Object i:lhm.keySet()) {
			System.out.println(i);
		} 
		System.out.println("----------");
		for(Object i:lhm.entrySet()) {
			System.out.println(i);
		}
	}
    
}
