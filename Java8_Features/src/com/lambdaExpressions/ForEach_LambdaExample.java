package com.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class ForEach_LambdaExample {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		
		list.forEach(n->System.out.println(n));

	}

}
