package javaBasicExercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {
//ArrayList implementation Example
	
public static void main(String[] args) {
	
	List<String> names = new ArrayList<>();
	names.add("Skuld");
	names.add("Barýs Ege");
	names.add("Aylin");
	names.add("Zulfu");
	names.add("Skuld");
	names.add("Barýs Ege");
	names.add("Aylin");
	names.add("Zulfu");
	System.out.println(names.get(0));
	System.out.println(names.remove(0));
	System.out.println(names.get(0));
	System.out.println(names.get(5));
	names.remove(5);
	System.out.println(names.get(5));
	for(String name: names)
		System.out.println(name);
}
}
