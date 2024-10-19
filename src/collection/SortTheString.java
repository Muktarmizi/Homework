package collection;

import java.util.Arrays;
import java.util.Iterator;

public class SortTheString {
//"hjgjhjhj67786     Rq9LAc3KMBm80 5o27leux4w        yakbz"

	public static void main(String[] args) {

		String s = "hjgjhjhj67786     Rq9LAc3KMBm80 5o27leux4w        yakbz";
		s = s.replaceAll("\\s", ""); // if we keep space after back slash the gap will show coma.

		char[] arr = s.toCharArray();
		System.out.println(Arrays.toString(arr)); // before sort.

		char temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
        System.out.println("After SortTheString :" + Arrays.toString(arr));
        
	}
}
