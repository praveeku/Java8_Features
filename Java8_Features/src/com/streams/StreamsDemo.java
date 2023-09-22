package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsDemo {

	static List<Product> productsList;

	public static void main(String[] args) {

		productsList = new ArrayList<Product>();

		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		System.out.println(withoutusingStreams().toString());

		List list = productsList.stream().filter(product -> product.price >= 28000).collect(Collectors.toList());

		list.forEach(p -> System.out.println("Byusing streams" + p));

		System.out.println(" *************************         ");

		Set set = productsList.stream().filter(product -> product.price >= 28000).collect(Collectors.toSet());

		set.forEach(p -> System.out.println("Byusing streams" + p));

		System.out.println(" *************************         ");

		// for fetching only price details

		List listofpriceonly = productsList.stream().filter(product -> product.price >= 28000)
				.map(product -> product.price).collect(Collectors.toList());// .forEach(System.out::println));
		System.out.println("by using map printing only price " + listofpriceonly);

		System.out.println(" =========================== Price list only =========       ");

		productsList.stream().filter(product -> product.price >= 28000)
				.forEach(product -> System.out.println(product.price));

		System.out.println(" =============  reduce method =========       ");

		float totalPrice = productsList.stream().map(product -> product.price).reduce(0.0f,
				(sum, price) -> sum + price); // accumulating price
		System.out.println(totalPrice);

		System.out.println(" =============  reduce method by using method  reference =========       ");

		float totalPrice2 = productsList.stream().map(product -> product.price).reduce(0.0f, (Float::sum)); // accumulating
																											// price
		System.out.println(totalPrice2);

		System.out.println(" =============   // Using Collectors's method to sum the prices.   =========       ");

		Double sum = productsList.stream().collect(Collectors.summingDouble(Product::getPrice));
		System.out.println("sum of values:" + sum);

		System.out.println(" =============  max() method to get max Product price    =========       ");
		// max() method to get max Product price
		Product productA = productsList.stream().min((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();

		System.out.println(productA.price);
		
		System.out.println(" =============  Avg method  =========       ");
		Double avg=productsList.stream().collect(Collectors.averagingDouble(product->product.price));
		System.out.println("average value : "+avg);
		
		
		System.out.println(" =============  Sum method  =========       ");
		Double sumvalue=productsList.stream().collect(Collectors.summingDouble(product->product.price));
		System.out.println("sum value : "+sumvalue);
		
		
		System.out.println(" =============  counting elements  method  =========       ");
		
		Long count = productsList.stream().collect(Collectors.counting());
		System.out.println("count  value : "+count);
		
		
		

	}

	// without using strams logic to filter the Product price morethan 28000
	static List<Product> withoutusingStreams() {

		List<Product> forStoring = new ArrayList<Product>();

		for (Product product : productsList) {

			if (product.price >= 28000) {

				forStoring.add(product);
			}

		}

		return forStoring;

	}

}
