package com.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingByLambda {

	public static void main(String[] args) {
		
		
		List<Product> list =new ArrayList<>();
		list.add(new Product(0, "praveen", 123));
		list.add(new Product(7, "cnu", 126));
		list.add(new Product(8, "sanju", 122));
		
		
		Collections.sort(list,(p1,p2)-> -p1.getName().compareTo(p2.getName()));
		
	//	Collections.sor
		
		
		for(Product p:list)
			System.out.println(p.getName()+"   "+p.getId()+"  "+p.getPrice());

	}

}
