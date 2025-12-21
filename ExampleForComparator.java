package basic;

/*Comparator:
 * predefined interface in java.util package-->jdk 1.2
 * Comparartor has an abstract method called compare()
 * Syntax:
 * public int compare(object1,object2);
 * Rules:
 * 1.Design a new class in such a way which implements the comparator interface and specify the generics type
 * 2.import the comparator interface
 * 3.override the coompare() by specifying the logic for comparing and sorting
 * 4.pass the object of the class which has the sorting logic to the related method. 
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class NameComparator implements Comparator<People>{

	@Override
	public int compare(People s1,People s2) {
		return s1.getName().compareTo(s2.getName());
	}
	
}

class RollNumberComparator implements Comparator<People>{

	@Override
	public int compare(People s1,People s2) {
		return s1.getRollNo().compareTo(s2.getRollNo());
	}
	
}
class People{
	private String name;
	private String rollNo;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	public String getName() {
		return name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public People(String name,String rollNo) {
		super();
		this.name=name;
		this.rollNo=rollNo;
	}
}


public class ExampleForComparator {

	public static void main(String[] args) {
		People s1=new People("sanji","s4");
		People s2=new People("zoro","s1");
		People s3=new People("nami","s2");
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
        Collections.sort(al,new RollNumberComparator());
        for(Object i:al)
        {
        	   System.out.println(i);
        }
	}

}
