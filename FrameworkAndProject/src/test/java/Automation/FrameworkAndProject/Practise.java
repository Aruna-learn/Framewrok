package Automation.FrameworkAndProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practise {

	public static void main (String[] args) {
		int a[]={1,2,3,4,5};
		System.out.println("first element of the array is:"+a[0]);
		System.out.println("last element of the array is:"+a[4]);
		int count=0;
		for(int i=a.length-1;i>=0;i--)
		{

			System.out.println(a[i]);


		}
		System.out.println(a.length);


		ArrayList<String> al=new ArrayList<String>();
		al.add("Aruna");
		al.add("reddy");
		al.add("poololla");
		al.add("strong");

		for(String va:al) {
			System.out.println(va);
		}

		System.out.println(al.size()); 
		System.out.println("************"); 
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println(al.contains("dfsjh"));


		//Arrays to arraylist
		String s[]= {"aruna","selenium","dfkjho","dsfjhodfa"};

		List<String> newlist=Arrays.asList(s);
		System.out.println(newlist.contains("ejry"));

		String st="Aruna reddy Poololla";

		String[] split=st.split("\\s");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);

		//		for(int i=0;i<st.length();i++) {
		//			System.out.println(st.charAt(i));
		//		}
		String rev="";
		for(int i=st.length()-1;i>=0;i--) {
			rev=rev+st.charAt(i);
		}
		System.out.println(rev);
	}

}
