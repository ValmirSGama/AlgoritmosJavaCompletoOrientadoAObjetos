package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		// Set<String> set = new HashSet<>();
		// Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notbook");
		
		// set.removeIf(x -> x.length() >= 3);
		
		set.removeIf(x -> x.charAt(0) == 'T');
		
		// System.out.println(set.contains("Notbook"));
		
		for(String p : set) {
			System.out.println(p);
		}
	}

}
