package test.java.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class test {
	@Test
	public static void regular() {
		//Count # of names
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhi");
		names.add("Don");
		names.add("Aleja");
		names.add("Saumya");
		names.add("Rahul");

		// 	int count = 0;
		// 	for (int i = 0; i < names.size(); i++) {
		// 		String name = names.get(i);
		// 		if (name.startsWith("A")) {
		// 			System.out.println("Starts with a " + name);
		// 			count++;
		// 		}

		// 	}
		// 	System.out.println(count);
		// }
	
	//How to use Lambda Expressions
//		 Long C = names.stream().filter(s -> s.startsWith("A")).count();
//		System.out.println(C);
//names.stream().filter(s->s.length()>4.forEach (s-> System.out.println(s)) - prints length of 4
//names.stream().filter(s ->s.length()>4).limit(1).forEach(s->System.out.println(s)); // Scan through each array and print in 1 shot
		}
	

	public static void streamMap() {

		//Mapping lowercase to upperCase
	// 	Stream.of("Abhijeeet", "Don", "Alekhya", "Adam", "rama").filter(s->s.endswith("a").map(s->s.toUpperCase()) //filter results and provide results
	// 	.forEach(s->System.out.println(s));
	// }


	// //print names with first letter as a uppercase and sorted

	// //Arrays.asList() - Converts into List
	// List<String> names = Arrays.asList("Abhijeeet", "Don", "Alekhya", "Adam", "rama");
	// names.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
// 	ArrayList<String> names = new ArrayList<String>();
// 	names.add("Abhi");
// 	names.add("Donny");
// 	names.add("Aleja");
// 	names.add("Saumya");
// 	names.add("Rahul");

// 	List<String> names1 = Arrays.asList("Abhijeeet", "Don", "Alekhya", "Adam", "rama");
// 	Stream <String> newStream =Stream.concat(names.stream(), names1.stream());
// newStream.sorted().forEach(s->System.out.println(s));

// boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));//Just return if condition is true or false
// Assert.assertTrue(flag);

	}

@Test
	public static void streamCollect() {
// List<String> ls=	Stream.of("Abhijeeet", "Don", "Alekhya", "Adam", "rama").filter(s->s.endswith("a").map(s->s.toUpperCase()).collect(Collectors.toList());
// 	ls.get(0);

	List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
values.stream().distinct().forEach(s->System.out.println(s));
System.out.println(values);
List<Integer> li= values.stream().sorted().distinct().sorted().collect(Collectors.toList());
System.out.println(li.get(2));
	//filter results and provide results
	}}