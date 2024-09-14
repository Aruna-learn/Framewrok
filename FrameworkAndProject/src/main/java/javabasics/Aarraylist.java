package javabasics;

import java.util.ArrayList;

public class Aarraylist {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("apple");
		al.add("banana");
		al.add("cherry");
		al.add("mango");
		al.add("apple");
		
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(0);
		
		System.out.println(al);
		
		System.out.println("orange not found:"+al.contains("orange"));
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++) {
			String value = al.get(i);
            // Print the index and value
            System.out.println("Index: " + i + ", Value: " + value);
        }
			
		

		
//		for(String list:al) {
//			System.out.println(list);
//			
//		}
	}

}
