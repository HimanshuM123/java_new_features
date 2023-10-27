package java11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//import org.jetbrains.annotations.NotNull;


public class LocalVariableSyntax {
	public static void main(String[] args) {
		IntStream.of(1, 2, 3, 5, 6, 7)
		.filter((var i) -> i % 2 == 0)
		.forEach(System.out::println);
		
		/*
		 * 
		 * then, why this JEP adds var in lambda parameters? The benefit is now we can
		 * add annotations to the lambda parameters, see this example:
		
		List<String> list = Arrays.asList("a", "b", "c", null);
		String result = list.stream().map((@NotNull var x) -> x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(result);
		 */
	}
}

/*
JDK 11 allows ‘var’ to be used in lambda expressions. 
This was introduced to be consistent with the local ‘var’ syntax of Java 10.


*/