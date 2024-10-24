package collection;

import java.security.AllPermission;
import java.util.Arrays;
import java.util.HashMap;

public class Duplicate_Words {

	public static void main(String[] args) {

		String s = "a beautiful beach bob a beautiful beach bob a beautiful beach bob a beautiful beach bob";

		// finding duplicate words.

		String[] arr = s.split(" ");

		s = s.replaceAll("\\s", "");

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = arr.length - 1; i >= 0; i--) {
			if (map.get(arr[i]) == null) {
				map.put(arr[i], 1);
			} else {
				int count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			}
		}
		for (String key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key + " : " + map.get(key) + "times\n");

			}
		}

	}

}
