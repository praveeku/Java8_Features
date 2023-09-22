package com.practice.java8programs;

import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Logical8JavaQuestionsPractice {

	public static void main(String[] args) {

		// java programme to count the occurance of each character in a given String
		
		String[] sarray= {"praveen","kumar","Akkenapally"};

		method1("Ilovejavaprogramme");
		
		method2(sarray);
	}

	
	private static void method1(String s) {
		System.out.println("count the occurance of each character in a given String");
		// char[] convertedarray= s.toCharArray();

		String[] stringArray = s.split("");
		System.out.println(Arrays.toString(stringArray));

		String optional=Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()))
		.entrySet()
				.stream()
				.filter(p -> p.getValue() > 1).collect(Collectors.toList()).get(1).getKey();

		System.out.println("Duplicate ==="+optional);
		
		
		

	}
	
	private static void method2(String[] sarray) {
	
		
	String longLenthString=	Arrays.stream(sarray).reduce((word1,word2 )-> word1.length() > word2.length() ? word1 : word2 ).get();
	
	System.out.println("Long lenthth string values ====   "+longLenthString);
		
	}


}
