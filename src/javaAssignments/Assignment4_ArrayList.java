package javaAssignments;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment4_ArrayList {

	public static void main(String[] args) {
        
		//ArrayList
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(100);
		al.add(60);
		al.add(250);
		al.add(140);
		al.add(20);
		al.add(200);
		al.add(170);
		al.add(220);
		al.add(160);
		al.add(85);
		
		//Print unsorted list
		System.out.println("Unsorted ArrayList: "+al);
		
		//Total elements in list
		System.out.println("Total Elements in ArrayList: "+al.size());
		
		//Sorting ArrayList in ascending order
		Collections.sort(al);
		
		//Print the sorted ArrayList
		System.out.println("Sorted ArrayList in ascending order: "+al);
	
	
	
	}

}
