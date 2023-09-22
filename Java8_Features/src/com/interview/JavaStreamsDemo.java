package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.lambdaExpressions.ForEach_LambdaExample;

public class JavaStreamsDemo {

	static List<Employee> employeeList = new ArrayList();

	public static List<Employee> getlist() {

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		return employeeList;

	}

	public static void main(String[] args) {

		// Finding List of employees
		employeeList = getlist();

		// Query 1 : How many male and female employees are there in the organization?
		method1();
		System.out.println("\n");
		// Query 2 : Print the name of all departments in the organization?
		method2();
		System.out.println("\n");
		// Query 3 : What is the average age of male and female employees?
		method3();
		System.out.println("\n");
		// Query 4 : Get the details of highest paid employee in the organization?
		method4();
		System.out.println("\n");
		// Query 5 : Get the names of all employees who have joined after 2015?
		method5();
		System.out.println("\n");
		// Query 6 : Count the number of employees in each department?
		method6();
		System.out.println("\n");
		// Query 7 : What is the average salary of each department?
		method7();
		System.out.println("\n");
		// Query 8 : Get the details of youngest male employee in the product
		// development department?
		method8();
		System.out.println("\n");
		// Query 9 : Who has the most working experience in the organization?
		method9();
		System.out.println("\n");
		// Query 10 : How many male and female employees are there in the sales and
		// marketing team?
		method10();
		System.out.println("\n");
		// Query 11 : What is the average salary of male and female employees?
		method11();
		System.out.println("\n");
		// Query 12 : List down the names of all employees in each department?
		method12();
		System.out.println("\n");
		// Query 13 : What is the average salary and total salary of the whole
		// organization?
		method13();
		System.out.println("\n");
		// Query 14 : Separate the employees who are younger or equal to 25 years from
		// those employees who are older than 25 years.
		method14();
		System.out.println("\n");
		// Query 15 : Who is the oldest employee in the organization? What is his age
		// and which department he belongs to?
		// method15();

		charcterOccurence();

		secondLowestLongestNumber();

		smallestMissingNumber();

		evenOrOddWithoutModularOperator(9);

		NonRepeatativeCharacter("praveen");
		
		IntersectionOfArrays();
		
		highesstNumberShouldCome();

	}

	private static void method1() {
		System.out.println("Query 1 : How many male and female employees are there in the organization?");
		Map<String, Long> count = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("counting of male and female employees :" + count);
	}

	// Query 2 : Print the name of all departments in the organization?
	private static void method2() {
		System.out.println(" All departments in the organization :");
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

	private static void method3() {
		System.out.println(" average age of male and female employees :");

		Map<String, Double> avgAgeofMaleFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		System.out.println("Average age of male and female" + avgAgeofMaleFemale);
	}

	// Query 4 : Get the details of highest paid employee in the organization?
	private static void method4() {

		Optional<Employee> highestpaid = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		
				

		System.out.println("highest paid employee in the organization : " + highestpaid);
	}

	// Query 5 : Get the names of all employees who have joined after 2015?
	private static void method5() {
		System.out.println("employees who have joined after 2015 : ");

		List list = employeeList.stream().filter(e -> e.yearOfJoining > 2015).map(Employee::getName)
				.collect(Collectors.toList());

		System.out.println(" employees who have joined after 2015 :printing as list : " + list);

		employeeList.stream().filter(e -> e.yearOfJoining > 2015).map(Employee::getName).forEach(System.out::println);
	}

	// Query 6 : Count the number of employees in each department?
	private static void method6() {

		Map<String, Long> noOfEmployeesbyDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println("number of Employees in each department " + noOfEmployeesbyDepartment);

		Set<Entry<String, Long>> entry = noOfEmployeesbyDepartment.entrySet();

		for (Entry<String, Long> dept : entry)
			System.out.println("department name : " + dept.getKey() + "Department count :" + dept.getValue());

	}

	// Query 7 : What is the average salary of each department?
	private static void method7() {

		Map<String, Double> avgSalOfEachDept = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println("Avg salary of Each department :" + avgSalOfEachDept);

		Double avgsalary = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));

		System.out.println("Average salary :" + avgsalary);

	}

	// Query 8 : Get the details of youngest male employee in the product
	// development department?
	private static void method8() {

		Optional<Employee> youngestMaleEmployeeintheProductdevelopmentdepartment = employeeList.stream()
				.filter(e -> e.gender.equalsIgnoreCase("male") && e.department.equals("Product Development"))
				.min(Comparator.comparingDouble(Employee::getAge));

		System.out
				.println("YoungestMaleEmployee : " + youngestMaleEmployeeintheProductdevelopmentdepartment.get().name);

	}

	// Query 9 : Who has the most working experience in the organization?
	private static void method9() {

		Optional<Employee> mostWorkingExperienceIntheorg = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getYearOfJoining)).findFirst();

		System.out.println(mostWorkingExperienceIntheorg.get());

	}

	// Query 10 : How many male and female employees are there in the sales and
	// marketing team?
	private static void method10() {

		Map<String, Long> maleandfemaleemployees = employeeList.stream()
				.filter(e -> e.department.equals("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(
				"male and female employees are there in the sales and marketing team" + maleandfemaleemployees);

	}

	// Query 11 : What is the average salary of male and female employees?
	private static void method11() {

		Map<String, Double> avgSalarybyMaileFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println("average salary of male and female employees :" + avgSalarybyMaileFemale);
	}

	// Query 12 : List down the names of all employees in each department?
	private static void method12() {

		Map<String, List<Employee>> employeeListDepartmentwise = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(employeeListDepartmentwise);

		Set<Entry<String, List<Employee>>> eployeeDepartmentwise = employeeListDepartmentwise.entrySet();

		for (Entry<String, List<Employee>> entryString : eployeeDepartmentwise)
			for (Employee employeeNames : entryString.getValue())

				// System.out.println("Department wise employees :
				// "+entryString.getKey()+":"+employeeNames.getName());

				System.out.println("names of all employees in each department wise :     " + entryString.getKey()
						+ "   :    " + employeeNames.getName());

	}

	// Query 13 : What is the average salary and total salary of the whole
	// organization?
	private static void method13() {

		Double avgsalary = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));

		System.out.println("average salary by normal approach "+avgsalary);

		DoubleSummaryStatistics summarysheetavgsalary = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		
		System.out.println("summarized method avg salry ==="+summarysheetavgsalary.getAverage());

		System.out.println("comparing :" + (summarysheetavgsalary.getAverage() == avgsalary));

		System.out.println(summarysheetavgsalary.getMax());

		System.out.println(summarysheetavgsalary.getSum());

	}

	// Query 14 : Separate the employees who are younger or equal to 25 years from
	// those employees who are older than 25 years.

	private static void method14() {

		Map<Boolean, List<Employee>> youngEmployee = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.age > 25));

		Set<Entry<Boolean, List<Employee>>> set = youngEmployee.entrySet();

		for (Entry<Boolean, List<Employee>> e : set)
			for (Employee list : e.getValue())
				System.out.println(list.getName());
		System.out.println("younger or equal to 25 years from those employees : ");

	}

	private static void charcterOccurence() {
		// final long count;

		String str = "JAVA PROGRAMMER";

		char[] chArray = str.toCharArray();

		Set<Character> set = new TreeSet();
		List<Character> list = new ArrayList();

		for (char c : chArray) {
			set.add(c);
			list.add(c);
		}

		// System.out.println("set values"+set);

		System.out.println("[");
		for (char c : set)
			// str.chars().filter(ch->ch==c).count();

			System.out.print(" -> " + c + "=" + str.chars().filter(ch -> ch == c).count());

		System.out.println("}");

		System.out.println();

		for (char c : list)
			// str.chars().filter(ch->ch==c).count();

			System.out.print("[" + c + " ==" + str.chars().filter(ch -> ch == c).count() + "]");

		System.out.println();
		// System.out.println(str.chars().sorted().toString());
		System.out.println(str.chars().boxed().sorted(Comparator.naturalOrder()).limit(5).skip(1).findAny());

	}

	private static void secondLowestLongestNumber() {

		int[] integerArray = { 11, 13, 65, 76, 45, 98, 123, 100, 111, 44 };

		int secondLowest = Arrays.stream(integerArray).boxed().sorted(Comparator.naturalOrder()).limit(2).skip(1)
				.findFirst().get();

		System.out.println("second Lowest number ===" + secondLowest);

		int secondHighest = Arrays.stream(integerArray).boxed().sorted(Comparator.naturalOrder()).limit(2).skip(1)
				.findFirst().get();

		System.out.println("second Highest number ===" + secondHighest);
	}

	// finding the smallest missing number
	private static void smallestMissingNumber() {

		int[] integerArray = { 1, 4, 6, 7, 2, 9 };

		Arrays.sort(integerArray);

		System.out.println(integerArray);
		int result = 1;

		for (int i = 0; i < integerArray.length; i++) {
			if (integerArray[i] == result) {
				result++;
			} else {
				System.out.println("missing number   :  " + result);
				break;
			}

		}

	}

	private static void evenOrOddWithoutModularOperator(int n) {

		if (n / 2 * 2 == n)
			System.out.println("even number");
		else
			System.out.println("Odd number");
	}

	private static void NonRepeatativeCharacter(String str) {

		Map<Character, Long> counting = str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		Map<String, Long> occurances  = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		Character value = counting.entrySet().stream().filter(e -> e.getValue() == 1)
				.findFirst().get().getKey();

		System.out.println("Non Repeatative Character : "+value);



	}
	
	private static void IntersectionOfArrays() {
		String[] array1= {"praveen","kiran","prasad","praveen","kiran"};
		String[] array2= {"chiru","kalayan","praveen","kiran","prasad","praveen","kiran"};
		
		Set<String> set=new HashSet<>();
		
		for(int i=0; i<array1.length;i++) 
			for(int j=0; j<array2.length;j++) 
				if(array1[i]==array2[j])
					set.add(array1[i]);
		
		System.out.println(set);
					
				
	}
	
	
	/*
	 * Given array as inputa[]={8,9,5,11,6,1,7,6} Covert it to output
	 * a[]={11,11,11,-1,7,7,-1,6} number towards Highest number should come , if
	 * there is no highest num towards right side print -1 ,
	 */
	
	private static void highesstNumberShouldCome() {
		
		int[] array1={8,9,5,11,6,1,7,6};
		int maxNumber=array1.length-1;
		
		for (int i=array1.length-2;i>=0;i--) {
			int temp =array1[i];
			
			if(maxNumber>array1[i]) {
				array1[i]=maxNumber;}
			else {
				array1[i]=-1;
			}
		if(maxNumber<temp)
			
			maxNumber=temp;
		
		}
		for(int i:array1)
		System.out.print(i+",");
		
	}

}
