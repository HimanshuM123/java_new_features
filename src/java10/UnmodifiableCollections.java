package java10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableCollections {
	public static void main(String[] args) {

// copyOf()
		List<Integer> someIntList = Arrays.asList(1, 2, 3);
		List<Integer> copyList = List.copyOf(someIntList);
		copyList.add(4);
		// Any attempt to modify such a collection would result in
		// java.lang.UnsupportedOperationExceptionruntime exception.

// toUnmodifiable*()

		List<Integer> evenList = someIntList.stream()
				.filter(i -> i % 2 == 0)
				.collect(Collectors.toUnmodifiableList());
		evenList.add(4);
		// Any attempt to modify such a collection would result
		// in java.lang.UnsupportedOperationExceptionruntime exception.
		
// Optional*.orElseThrow()

		Integer firstEven = someIntList.stream()
			      .filter(i -> i % 2 == 0)
			      .findFirst()
			      .orElseThrow();
		//java.util.Optional, java.util.OptionalDouble, java.util.OptionalIntand java.util.OptionalLongeach 
		//got a new method orElseThrow()which doesn’t take any argument and throws NoSuchElementExceptionif no value is present
		
	}
}
