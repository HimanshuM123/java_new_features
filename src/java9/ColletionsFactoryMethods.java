package java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColletionsFactoryMethods {
	public static void main(String[] args) {
		List<String> list = List.of("Java", "JavaFX", "Spring", "Hibernate", "JSP");
		for (String l : list) {
			System.out.println(l);
		}

		Set<String> set = Set.of("Java", "JavaFX", "Spring", "Hibernate", "JSP");
		for (String l : set) {
			System.out.println(l);
		}

		Map<Integer, String> map = Map.of(101, "JavaFX", 102, "Hibernate", 103, "Spring MVC");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
/*
To avoid repetation
  List<String> list = new ArrayList<>();  
        list.add("Java");  
        list.add("JavaFX");  
        list.add("Spring");  
        list.add("Hibernate");  
        list.add("JSP");  

Java 9 Collection library includes static factory methods for List, Set and Map interface. 
These methods are useful to create small number of collection.


*/
