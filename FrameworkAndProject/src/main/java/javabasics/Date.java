package javabasics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.text.ParseException;  
 
import java.util.*;

  



public class Date {

	public static void main(String[] args) throws Throwable {
//		LocalDate date = LocalDate.now();    
//	    LocalDate yesterday = date.minusDays(1);    
//	    LocalDate tomorrow = yesterday.plusDays(2);    
//	    System.out.println("Today date: "+date);    
//	    System.out.println("Yesterday date: "+yesterday);    
//	    System.out.println("Tomorrow date: "+tomorrow); 
		
//	    Date date = new Date();  
//	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
//	    String strDate = formatter.format(date);  
//	    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
//	  
//	    formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
//	    strDate = formatter.format(date);  
//	    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
//	  
//	    formatter = new SimpleDateFormat("dd MMMM yyyy");  
//	    strDate = formatter.format(date);  
//	    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
//	  
//	    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
//	    strDate = formatter.format(date);  
//	    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
//	  
//	    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
//	    strDate = formatter.format(date);  
//	    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
//	
//	    Serializable d = DateFormat.getDateInstance().parse("31 Mar, 2015");  
//        System.out.println("Date is: "+d); 
//		
        Date d= new Date();

        SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
        SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
       // System.out.println(sdf.getInstance.format(d));
        System.out.println(sd.getDateInstance().format(d));
        System.out.println(d.toString());
	      
        
	}

}
