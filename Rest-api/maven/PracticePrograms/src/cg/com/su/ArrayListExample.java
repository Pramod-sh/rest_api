package cg.com.su;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class ArrayListExample {
	public static void main(String arg[]) {
		
		//Size is fixed
		//it is hetarogenuius elemnets
		int a[] = {1,2,3};
		//System.out.println(a[1]);
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Mangoe");
		list.add("Banana");
		list.add("dragon");
		list.add("Grapes");
		list.add("Apple");
		list.add("Apple");
		list.add("Strawberry");
		
		list.get(1);
		//System.out.println(list);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		hs1.add(100);
		hs1.add(105);
		hs1.add(102);
		hs1.add(102);
		hs1.add(104);
		hs1.add(105);
		
		//System.out.println("HashSet elements "+ hs1);//cannot duplicate
		
		
		
//		LinkedList<String> list1 = new LinkedList<Interger>();
//		
//		list1.add("Audi");
//		list1.add("BMW");
//		list1.add("Jaguar");
//		list1.add("TATA");
//		list1.add("Honda");
//		list1.add("Thar");
//		list1.add("Ambasador");
//		
		//list.get(1);
		//System.out.println(list1);
		
		
LinkedHashSet<Integer> hs2 = new LinkedHashSet<Integer>();
		
		hs2.add(100);
		hs2.add(105);
		hs2.add(102);
		hs2.add(102);
		hs2.add(104);
		hs2.add(105);
		
		//System.out.println("Linked HashSet elements "+ hs2);
		
		
TreeSet<Integer> hs3 = new TreeSet<Integer>();
		
		hs3.add(4);
		hs3.add(156);
		hs3.add(15);
		hs3.add(155);
		hs3.add(1044);
		hs3.add(105);
		//hs3.delete();
		//It has deafault natural sorting orders
		//System.out.println("TreeSet elements "+ hs3);
		
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		}  
	
	TreeMap<Integer,String> map1=new TreeMap<Integer,String>();//Creating HashMap    
	   map1.put(1,"Mango"); //Put elements in Map  
	   map1.put(2,"Apple");    
	   map1.put(3,"Banana");   
	   map1.put(4,"Grapes");   
	       
	   System.out.println("Iterating Hashmap...");  
	   for(Map.Entry m : map1.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }  
}

