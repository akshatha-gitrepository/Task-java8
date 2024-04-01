package task2;

import java.util.List;
import java.util.stream.Collectors;

public class CommonLetter {
	public static List<String> commonLetter(List<String> cricketList, List<String> hockeyList) {
		return cricketList.stream().filter(hockeyList::contains).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		
		List<String> cricketList = List.of("A", "B", "C");
		List<String> hockeyList = List.of("E", "F", "C");
		List<String> commonElements = commonLetter(cricketList, hockeyList);
		System.out.println("Common elements: " + commonElements);
	}
}
