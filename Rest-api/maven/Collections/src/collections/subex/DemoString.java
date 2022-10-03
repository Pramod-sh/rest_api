package collections.subex;

import java.util.ArrayList;

public class DemoString {

	public static void main(String[] args) {
		ArrayList<String> val = new ArrayList<String>();
		
		val.add("Corona can be stopped");
		ArrayList<String> val2 = new ArrayList<String>();
		val2.add("Staying at Home");
		
		val.addAll(val2);
		System.out.println(val);
	}

}
