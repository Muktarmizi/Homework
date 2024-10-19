package collection;

import java.util.HashSet;
import java.util.Set;

public class MoreThenOneString {

	public static void mian(String[]args) {
		
		String[] lg = {"A++", "C++", "C#", "P++", "A++", "C++", "A++", "P++", "Java", "C++"};
		
		Set<String> doubleLg=new HashSet<>();
		
		for (int i = 0;i<lg.length;i++) {
			for(int j=i+1;j<lg.length;j++) {
				if (lg[i].equals(lg[j])) {
					doubleLg.add(lg[i]);
					
					
				}
			}
		
		
	}
	
	
	
	
	
	System.out.println("More the one String :" + doubleLg);
	
	
	
	
	}
	
}
