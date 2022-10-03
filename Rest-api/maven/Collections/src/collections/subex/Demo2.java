package collections.subex;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Integer> val = new ArrayList<Integer>();
		
		val.add(0);
		val.add(23);
		val.add(13);
		val.add(45);
		val.add(56);
		
		for(Integer e:val)
		{
			System.out.println(e);
		}
System.out.println("ArrayList:" +val);
	}

}
