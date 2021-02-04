package com.mindtree.Service;

import java.util.Scanner;

public class ValidateInputs {
      static Scanner sc=new Scanner(System.in);
      public static String stringValidate(String s) {  //String Validate
  		boolean correct = false;
  		while(correct != true) {
  			for(int i=0;i<s.length();i++) {
  				if(!(s.charAt(i)>='a' && s.charAt(i)<='z') && !(s.charAt(i)>='A' && s.charAt(i)<='Z'))
  				{
  					System.out.println("Name should not have an integer \n Enter a string again: ");
  					s = sc.next();
  				}else {
  					correct = true;
  				}
  				
  				}
  		} return s;
  	}
      
      public static int intValidate() {                         //Int validate
  		int data = 0;
  		boolean validation = false;
  		while (validation == false) {
  			if (sc.hasNextInt()) {
  				data = sc.nextInt();
  				validation = true;
  			} else if (!sc.hasNextInt()) {
  				System.out.println("you didn't type an integer value ! please type an integer");
  				sc.next();
  			}
  		}
  		return data;
  	}
      
     public static double doubleValidate() {                              //double validate
  		double data = 0;
  		boolean validation = false;
  		while (validation == false) {
  			if (sc.hasNextDouble()) {
  				data = sc.nextDouble();
  				validation = true;
  			} else if (!sc.hasNextDouble()) {
  				System.out.println("you didn't type an integer value ! please type an integer");
  				sc.next();
  			}
  		}
  		
  		return data;
  	}
      public static String timeValidate(String s) {                           //String time validate
 		 boolean valid = false;
 			while(valid != true ) {
 				for(int i=0;i<s.length();i++) {
 					if(s.length()!=5 || !(((s.charAt(0)-'0')*10+(s.charAt(1)-'0'))>=0 && ((s.charAt(0)-'0')*10+(s.charAt(1)-'0'))<=12) || !(((s.charAt(3)-'0')*10 +(s.charAt(4)-'0'))>= 0 && ((s.charAt(3)-'0')*10+(s.charAt(4)-'0'))<=60)) {
 						System.out.println("Time should be in the formatt hh:mm");
 						System.out.println("Please enter the correct format ");
 						s=sc.next();
 					}else {
 						valid = true;
 					}
 				
 				}
 				
 				}
 			return s;
 		
 	}
      public static String dateValidate(String s) {                          // Date validate
  		boolean valid = false;
  		while(valid != true ) {
  			for(int i=0;i<s.length();i++) {
  				if(s.length()!=10 || !(s.charAt(i)>='0' && s.charAt(i)<='9') && (s.charAt(i) != '/')) {
  					System.out.println("Date should be in the format dd/mm/yyyy");
  					System.out.println("Please enter the correct format");
  					s=sc.next();
  				} else {
  					valid = true;
  				}
  			}
  		}
  		return s;
  	}
     

  	public static String vehicleValidate(String s) {
  		boolean correct = false;
  		while(correct != true) {
  			for(int i=0;i<s.length();i++) {
  				if(!(s.charAt(i)>='a' && s.charAt(i)<='z') && !(s.charAt(i)>='A' && s.charAt(i)<='Z') && !(s.charAt(i)>='0' && s.charAt(i)<='9'))
  				{
  					System.out.println("Vehicle number contain numbers and alphabets \n Enter a valid vehicle num again: ");
  					s = sc.next();
  				}else {
  					correct = true;
  				}
  				
  				}
  		} return s;

  		}
  	public static String timeValidate1(String s) {      //vehicle time 
		boolean valid = false;
		while(valid != true ) {
			for(int i=0;i<s.length();i++) {
				if(s.length()!=5 || !(((s.charAt(0)-'0')*10+(s.charAt(1)-'0'))>=0 && ((s.charAt(0)-'0')*10+(s.charAt(1)-'0'))<=24) || !(((s.charAt(3)-'0')*10 +(s.charAt(4)-'0'))>= 0 && ((s.charAt(3)-'0')*10+(s.charAt(4)-'0'))<=60)) {
					System.out.println("Time should be in the formatt hh:mm");
					System.out.println("Please enter the correct format ");
					s=sc.next();
				}else {
					valid = true;
				}
			
			}
			
			}
		return s;
		}

	
      
      
}
