package streams.LamdaEXpressions;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamEx {

@Test
	public void regular() {

		//count the number of name starts with letter a in the list
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhi");
		names.add("Aruna");
		names.add("Mona");
		names.add("Sena");
		names.add("Abhimanyu");

		int count=0;
		for(int i=0;i<names.size();i++) {
			String actual=names.get(i);
			if(actual.startsWith("A")) {
				count++;

			}
		}
		System.out.println(count);

}
		






@Test
		public void streamfilter() {
			
			ArrayList<String> names=new ArrayList<String>();
			names.add("Abhi");
			names.add("Aruna");
			names.add("Mona");
			names.add("Sena");
			names.add("Abhimanyu");
			
			Long c=names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
			//Stream.of("Aruna","dfjshd","fijygre",)
			
			
			
			
		}
			
		







	


}
