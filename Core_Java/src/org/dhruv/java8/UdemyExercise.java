package org.dhruv.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UdemyExercise {
	public static void main(String[] args) {
		
		
		Integer[] arr = new Integer[] {12,9,11,15,24,20,21,19};
		List<Integer> list = Arrays.asList(arr);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		//print only odd numbers from the list
		printAllOddNumbers(list);
		
		//print square of even numbers
		printSquareOfEcvenNumbers(list);
		
		/*
		 * Map<String,List<Integer>> map = new HashMap<>();
		 * map.put("Dhruv",Arrays.asList(new Integer[] {12,9,11,15}));
		 * map.put("Aneri",Arrays.asList(new Integer[] {12,9,11,15,21,}));
		 * map.put("Deetya",list);
		 * 
		 * 
		 * //find largest cube printLargestNumbersWithSum(map);
		 */
		
		//Print Courses Containing the word "Spring"
		printCoursesWithSpring(courses);
		
		//Print Courses Whose Name has atleast 4 letters
		printCoursesWithMoreThan4Letters(courses);
		
		//Print the number of characters in each course name
		printNoOfCharInEachCourse(courses);
		
		//Square every number in a list and find the sum of squares
		findSumOfSquares(list);
		
		//Cube every number in a list and find the sum of cubes
		findSumOfCubes(list);
		
		//Find Sum of Odd Numbers in a list
		findSumOfOddNumbers(list);
		
		//Create a List with Even Numbers Filtered from the Numbers List
		findListOfEvenNumbers(list);
		
		//Create a List with lengths of all course titles.
		findListOfLengthsofAllCourses(courses);

		//Find Functional Interface behind the second argument of reduce method. Create an implementation for the Functional Interface.
		//int sum = numbers.stream() .reduce(0, Integer::sum);
		BinaryOperator<Integer> sumOfNum = Integer::sum;
		BinaryOperator<Integer> sumOfNum2 = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer integer, Integer integer2) {
				return integer + integer2;
			}
		};
		System.out.println("Sum of all numbers using function interface : "+list.stream().reduce(0, sumOfNum));

        //Do Behavior Parameterization for the mapping logic.
        //
        Function<Integer, Integer> integerIntegerFunction = x -> x * x;
        List squaredNumbers = list.stream() .map(integerIntegerFunction) .collect(Collectors.toList());

	}

	private static void findListOfLengthsofAllCourses(List<String> courses) {
		// TODO Auto-generated method stub
		System.out.println("Find list of course length : "+courses.stream().map(course -> course.length()).collect(Collectors.toList()));
	}

	private static void findListOfEvenNumbers(List<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("Find list of even numbers : "+list.stream().filter(num->num%2==0).collect(Collectors.toList()));
	}

	private static void findSumOfOddNumbers(List<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("Sum of Odd Numbers in a list : "+list.stream().filter(num->num%2!=0).reduce(0,Integer::sum));
	}

	private static void findSumOfCubes(List<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("find the sum of cubes : "+list.stream().map(num->num*num*num).reduce(0,Integer::sum));
	}

	private static void findSumOfSquares(List<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("find the sum of squares : "+list.stream().map(num->num*num).reduce(0,Integer::sum));
	}

	private static void printNoOfCharInEachCourse(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream()
		.map(course -> course + " " + course.length()) 
		.forEach(System.out::println);
		
	}

	private static void printCoursesWithMoreThan4Letters(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream().filter(course -> course.length() >= 4).
					forEach(System.out::println);
	}

	private static void printCoursesWithSpring(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream().filter(course -> course.contains("Spring")).
				forEach(System.out::println);		
	}

	/*
	 * private static void printLargestNumbersWithSum(Map<String, List<Integer>>
	 * map) { // TODO Auto-generated method stub map.stream(). }
	 */

	private static void printSquareOfEcvenNumbers(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().filter(num -> num % 2 == 0).
						map(p -> p * p).
						forEach(System.out::println);
		
	}

	private static void printAllOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(num -> num % 2 != 0).
			forEach(System.out::println);
	}
	
	
	
}
