package com.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

@FunctionalInterface
interface Drawable2{
	void draw();
}

@FunctionalInterface
interface Sayable2 {
	
	String returnMethod (String message);

}
@FunctionalInterface
interface Addable2{
	int add(int a, int b);
}
@FunctionalInterface
interface StringConcat{
	String strcon(int a, String b);
}



public class LambdaDemo {

	static int methodRefAdd(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		int width=10;
		
//	BiFunction<int, int, int> bif=	LambdaDemo::methodRefAdd();
		
		//Without Lambda expression 
		
		Drawable2 d=new Drawable2() {			
			@Override
			public void draw() {
				System.out.println("without Lambda expression  Method:"+width);
				
			}
		};
		d.draw();		
		
		
		
		//By modifying the method //Without Lambda expression 
		
		Drawable2 d2=()-> {System.out.println("without Lambda expression  Method:"+width);};
				
			
		d2.draw();
		
		//with lambda expression 
		Drawable2 withlambda=()->System.out.println("with Lambda expression  Method:"+width);		
		withlambda.draw();
		
		
		// including return keyword
		Sayable2 say=(p1)->{return p1;};
		System.out.println(say.returnMethod("hello return method"));
		
		
	
		// Excluding return keyword
				Sayable2 withoutReturn=p1->p1;
				System.out.println(say.returnMethod("without  return keyword"));
				
				
				
				
				//ADDING 
	// Adding two numbers without and with return type and datatype 
				
				
				Addable addwithDatatypeReturnType=(int a, int b)->{return (a+b);};
				
				System.out.println("Adding two values by using return type : "+addwithDatatypeReturnType.add(10, 10));
				
			
				
				
				//Without DATATYPE 
				
				
				Addable2 addwithoutDattype=(a,b)->(a+b);
				
				System.out.println("without passing dattype and return type : "+addwithoutDattype.add(10, 20));
				
				
				
				
				StringConcat sc=( a, b)->a+b;
				System.out.println("by passing String types :"+sc.strcon(10 ,"brahmam"));
				
				

				StringConcat sc2=( s1, s2)->s1+s2;
				System.out.println("by passing String types :"+sc.strcon(10 ,"brahmam"));
				
		//thread example					
				Runnable runn=()->System.out.println("Thread 1 is running ");				
				Thread t1=new Thread(runn);				
				t1.start();
				
				
				//thread creation in old style
				
				Thread t=new Thread(new Runnable() {					
					@Override
					public void run() {
				System.out.println("run method without Lambda expression");
						
					}
				});
				t.start();
				
				
			
				
				 List<Product> list=new ArrayList<Product>();  
		          
			        //Adding Products  
			        list.add(new Product(1,"Samsung A5",17000f));  
			        list.add(new Product(3,"Iphone 6S",65000f));  
			        list.add(new Product(2,"Sony Xperia",25000f));  
			        list.add(new Product(4,"Nokia Lumia",15000f));  
			        list.add(new Product(5,"Redmi4 ",26000f));  
			        list.add(new Product(6,"Lenevo Vibe",19000f));  
			          
			        System.out.println("Sorting on the basis of name...");  
			        System.out.println();
				Collections.sort(list,(p1,p2)-> p1.name.compareTo(p2.name));
				
				list.forEach(n->System.out.println("Iterting through collection for each : "+n.name+"......"+n.id));
				System.out.println("");
				
				
				list.forEach(p->System.out.println("practicing ===="+p.id));
				
				for(Product p:list)
					System.out.println("Iterate collection through for loop :"+p.name);
				
				System.out.println();
				
			list.stream().filter(p->p.price<17000).forEach(n-> System.out.println(n.price));;
					
				
	
	}
	


}
