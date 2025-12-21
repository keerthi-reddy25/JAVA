package basic;

import java.util.ArrayDeque;

public class ExampleForArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.add(10);
		ad.add(20);
		ad.add(23);
		System.out.println(ad);
		System.out.println("------------");
		System.out.println(ad.poll());
		System.out.println("------------");
		for(Object i:ad) {
			System.out.println(ad);
		}
		System.out.println("----------");
        System.out.println(ad.remove(23));
        System.out.println("----------");
        System.out.println(ad);
	}

}
