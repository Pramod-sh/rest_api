package collections.subex;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLIst {

	public static void main(String[] args) {
		LinkedList<String> val = new LinkedList<String>();
		val.add("Pramod");
		val.add("Harshu");
		val.add("Gayatri");
		val.add("Maddy");
		
		Iterator<String> itr = val.iterator();
		
		while(itr.hasNext());
		System.out.println(itr.next());

	}

}
