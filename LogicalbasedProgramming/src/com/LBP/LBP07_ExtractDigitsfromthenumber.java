package com.LBP;

import java.util.Scanner;

public class LBP07_ExtractDigitsfromthenumber {
	static int d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter input ");
		int n=scanner.nextInt();
		
		
		
		while(n!=0) {
			
			d=n%10;
			System.out.print(""+d);
			n=n/10;
			
		}
		
	}

}

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	private static Map<String, String> cache = new HashMap<>();

	public static void main(String[] args) {
		String input = "India";
		String compressed = compressString(input);
		System.out.println("Compressed String (First Query): " + compressed);
// Query the same input again 
		String cachedResult = getCachedResult(input);
		System.out.println("Compressed String (Cached Query): " + cachedResult);
	}

	public static String compressString(String input) {
		if (cache.containsKey(input)) {
			return cache.get(input);
		}
		StringBuilder compressed = new StringBuilder();
		int count = 1;
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == input.charAt(i - 1)) {
				count++;
			} else {
				compressed.append(input.charAt(i - 1));
				if (count > 1) {
					compressed.append(count);
				}
				count = 1;
			}
		}
		compressed.append(input.charAt(input.length() - 1));
		if (count > 1) {
			compressed.append(count);
		}
		String result = compressed.toString();
		cache.put(input, result); 
		// Cache the result 
		return result; } public static String getCachedResult(String
									 input) { return cache.getOrDefault(input, "");
	}
}