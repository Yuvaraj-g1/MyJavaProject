
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> words = new HashSet<>();
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a unique word (or quit):");
			String input = kb.nextLine();
			if(input.equalsIgnoreCase("quit")) {
				break;
			}
			
			if(!words.add(input)) {
				System.out.println("Oh, that's a duplicate!!");
			}
		}
		
		System.out.println("------------ all unique words ---------");
		for(String s : words) {
			System.out.println(s);
		}

	}

}
