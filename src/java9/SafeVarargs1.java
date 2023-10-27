package java9;

import java.util.ArrayList;
import java.util.List;

public class SafeVarargs1 {
	@SafeVarargs//no warning compile time
	private void display(List<String>... products) { 
		for (List<String> product : products) {
			System.out.println(product);
		}
	}

	public static void main(String[] args) {
		SafeVarargs1 p = new SafeVarargs1();
		List<String> list = new ArrayList<String>();
		list.add("Laptop");
		list.add("Tablet");
		p.display(list);
	}
}

/*

It was included in Java7 and can only be applied on
Final methods
Static methods
Constructors
From Java 9, it can also be used with private instance methods.


*/
