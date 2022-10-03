package collections.subex;

import java.util.ArrayList;

public class LIstDemo {

	public static void main(String[] args) {
		ArrayList<Integer> val = new ArrayList<Integer>();
		val.add(0);
		val.add(12);
		val.add(23);
		val.add(54);
		val.add(65);
		val.add(10);
		val.remove(1);
		System.out.println("ArrayList:" + val);
		
	}

}
