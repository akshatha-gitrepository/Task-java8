import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import task2.CommonLetter;

class CommonElementTest {
	
	

	@Test
	void testCommonElementfromGivenList() {
		
		List<String> a=List.of("a","b","c");
		List<String> b=List.of("e","f","c");
		List<String> c= CommonLetter.commonLetter(a, b);
		assertEquals(List.of("c"), c);
		
		
	}
	
	 @Test
	    void testCommonLetterWithEmptyLists() {
	       
	        List<String> cricketList = List.of();
	        List<String> hockeyList = List.of();
	        List<String> commonElements = CommonLetter.commonLetter(cricketList, hockeyList);
	        assertEquals(List.of(), commonElements);
	    }

	    @Test
	    void testCommonLetterWithNoCommonElements() {
	        
	        List<String> cricketList = List.of("A", "B", "X");
	        List<String> hockeyList = List.of("E", "F", "C");
	        List<String> commonElements = CommonLetter.commonLetter(cricketList, hockeyList);
	        assertEquals(List.of(), commonElements);
	    }

}
