package java_8_Interview;

import java.util.Arrays;
import java.util.List;

public class FindTotalNumber {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		long count = myList.stream().count();
		System.out.println(count);
	}
}
