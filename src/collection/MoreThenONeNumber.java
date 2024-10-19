package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MoreThenONeNumber {

	public static void main(String[] args) {
		int[] age = { 11, 13, 15, 16, 11, 15, 13, 13, 11, 15, 11, 16 };
		Set<Integer> doubleAge = new HashSet<>();

		for (int i = 0; i < age.length; i++) {
			for (int j = i + 1; j < age.length; j++) {
				if (age[i] == age[j]) {
					doubleAge.add(age[i]);
       }
          }
		    }
              System.out.println("More Then One :" + doubleAge);
	}
                                   
}
