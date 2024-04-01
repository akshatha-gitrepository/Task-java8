import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import task1.FindRepeatedNos;

class FindRepeatedNosTest {

	@Test
	void repeatedNumberMoreThanOnceTest() {
		int[] numbers = { 1, 1, 3, 4, 5, 3, 2, 3, 5, 6, 4, 7, 6, 8 };
		// Assuming the repeated numbers are 1, 3, 4, 5, 6
		Map<Integer, Long> occurrences = FindRepeatedNos.occurenceOfElement(numbers);
		String result = occurrences.toString();
		assertEquals("{1=2, 2=1, 3=3, 4=2, 5=2, 6=2, 7=1, 8=1}", result);
	}
	
	
	@Test
	void repeatedNumberMismatchTest() {
		int[] numbers = { 1, 1, 3, 4, 5, 3, 2, 3, 5, 6, 4, 7, 6, 8 };
		// Assuming the repeated numbers are 1, 3, 4, 5, 6
		Map<Integer, Long> occurrences = FindRepeatedNos.occurenceOfElement(numbers);
		String result = occurrences.toString();
		//incorrect matches which has 8 as repeated as 2 times
		String incorrectExpectedValue = "{1=2, 2=1, 3=3, 4=2, 5=2, 6=2, 7=1, 8=2}";
		assertNotEquals(incorrectExpectedValue, result);
	}
	
	

}
