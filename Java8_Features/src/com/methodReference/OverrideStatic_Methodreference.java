package com.methodReference;

import java.util.function.BiFunction;

class Addable {
	
	static int add(int a, int b) {
		return a+b;
	}
	static float add(float a, int b) {
		return a+b;
	}
	static float add(float a, float b) {
		return a+b;
	}
}

public class OverrideStatic_Methodreference {

	public static void main(String[] args) {
		
		
		BiFunction<Integer, Integer,Integer> addrer1=Addable::add;
		BiFunction<Float, Integer,Float>  adder2=Addable::add;
		BiFunction<Float, Float,Float>  adder3=Addable::add;
		
		int result=addrer1.apply(10, 12);
		float result1=adder2.apply(10f, 12);
		float result2=adder3.apply(10f, 12.0f);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		
		
		
	}

}
