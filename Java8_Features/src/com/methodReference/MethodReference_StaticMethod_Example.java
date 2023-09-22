package com.methodReference;
import java.util.stream.Collectors; 
import com.lambdaExpressions.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

interface MethodReferenceInterface {
	
	public void say();

}

/*
 * class Arithmetic{ public static int add(int a, int b){ return a+b; } }
 */  


public class MethodReference_StaticMethod_Example {

	public static void   saysomething() {
		System.out.println("static method reference");
		
	}
	
	public static int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
//we have defined a functional interface and referring a static method to it's functional method say().
MethodReferenceInterface sayable=MethodReference_StaticMethod_Example::saysomething;
sayable.say();


//You can also use predefined functional interface to refer methods. In the following example, we are using BiFunction interface and using it's apply() method.
BiFunction<Integer, Integer, Integer> bif=MethodReference_StaticMethod_Example::add;

int result=bif.apply(10, 10);


System.out.println(result);


List<Product> productsList = new ArrayList<Product>();  
//Adding Products  
productsList.add(new Product(1,"HP Laptop",25000f));  
productsList.add(new Product(2,"Dell Laptop",30000f));  
productsList.add(new Product(3,"Lenevo Laptop",28000f));  
productsList.add(new Product(4,"Sony Laptop",28000f));  
productsList.add(new Product(5,"Apple Laptop",90000f));  
/*
 * List<Float> productPriceList2 =productsList.stream() .filter(p -> p.getPrice
 * > 30000)// filtering data .map(p->p.getPrice) // fetching price
 * .collect(Collectors.toList()); // collecting as list
 * System.out.println(productPriceList2);
 */





productsList.stream().filter(p->p.getPrice()>30000).forEach(p->System.out.println(p.getPrice()));

/*.map(p->p.getPrice())
.collect(Collectors.toList()));*/

productsList.stream().filter(p->p.getName().contains("HP")).forEach(p->System.out.println(p.getName()));
		
	}
	
	
	

}
