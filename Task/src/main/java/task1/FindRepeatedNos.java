package task1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatedNos {

	
	public static Map<Integer, Long> occurenceOfElement(int[] list) {

		Map<Integer, Long> occurrences = Arrays.stream(list).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return occurrences;
	}

	public static void printRepeatedNos(Map<Integer, Long> occurence) {

		occurence.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> {
			System.out.println("Repeated number: " + entry.getKey());
			System.out.println("Number of occurrences: " + entry.getValue());
		});
	}

	public static void main(String[] args) {

		int[] numbers = { 1, 1, 3, 4, 5, 3, 2, 3, 5, 6, 4, 7, 6, 8 };
		Map<Integer, Long> occurrences=occurenceOfElement(numbers);
		printRepeatedNos(occurrences);

	}	
}
