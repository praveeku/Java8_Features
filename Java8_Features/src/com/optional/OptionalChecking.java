package com.optional;

import java.util.Optional;

public class OptionalChecking {

	public static void main(String[] args) {
	
		String[] strarray=new String[10];
		
		/*
		 * String lowercasevalue=strarray[5].toLowerCase();
		 * System.out.println(lowercasevalue);
		 */
		
		strarray[5]="content";
		 
		
		Optional checkNull=Optional.ofNullable(strarray[5]);
		
		
		
		if(checkNull.isPresent())
		{
			String valuewithOptional=strarray[5].toLowerCase();
			System.out.println("after utilizing Optional functionality:   "+valuewithOptional);
		}
		else {
			System.out.println("value is not available");
			
			
			
		}
		
		checkNull.ifPresent(System.out::println);
		System.out.println("get value : "+checkNull.get());
		
		
		Optional optional=Optional.empty();
		System.out.println("empty checking: "+optional);

	}

}
