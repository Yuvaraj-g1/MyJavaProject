import java.util.*;
import java.util.stream.Collectors;
public class Streams4 {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("hi", "hello","there","goodie","bye");


		List<String> excitingWords = words.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
		System.out.println(excitingWords);

		List<String> bWords = words.stream().filter(s -> s.contains("b")).collect(Collectors.toList());
		System.out.println(bWords);
		
		List<String> evenWords = words.stream().filter(s -> (s.length() % 2) == 0).collect(Collectors.toList());
		System.out.println(evenWords);
	}

}


