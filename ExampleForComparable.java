package basic;

/*Comparable is a predefined interface in java.lang package
 * Comparable was introduces from jdk 1.2
 * comparable interface has a abstract method called as compareTo()
 * Comparable is used to compare objects and sort them
 * default sorting
 * Syntax:
 * public int compareTo(){
 * }
 * 
 * compareTo() return:
 * +1 if it is greater than
 * -1 if it is lesser than
 * 0 if te objects same
 * 
 * Rules to make the objects as comparable/Rules in order to work with comparable interface
 * 1.class has to implement comparable interface
 * 2.specify the generics type of which objects we are going to compare
 * Override the compareTo() by specifying the bussiness logic of comparing or so 

*/

import java.util.TreeSet;

class Car implements Comparable<Car>{
	int cost;
	Car(int cost){
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Car [cost=" +cost +"]";
		
	}
	@Override
	public int compareTo(Car c) {
		return this.cost-c.cost;
	}
}

public class ExampleForComparable {

	public static void main(String[] args) {
		Car c1=new Car(300);
		Car c2=new Car(100);
		Car c3=new Car(200);
		TreeSet<Car> ts=new TreeSet<Car>();
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		for(Car i:ts) {
			System.out.println(i);
		}
	}

}
