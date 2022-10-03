package collections.subex;

import java.util.ArrayList;

public class BooleanDemo {

	public static void main(String[] args) {
		ArrayList<String> var = new ArrayList<String>();
		 var.add("pen");
		 var.add("Pencil");
		 var.add("eraser");
		 
		 System.out.println("List" +var);
		 boolean res = var.contains("Pencil");
		 System.out.println("is Pencil present in the List: "  +res);
		 

	}

}
