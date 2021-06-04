import java.util.*;
import java.util.stream.Collectors;
public class Streams3 {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("hi", "hello","there","goodie");


		List<String> excitingWords = words.stream().map(s -> s + "!").collect(Collectors.toList());
		System.out.println(excitingWords);

		List<String> eyeWords = words.stream().map(s -> s.replace("i", "eye")).collect(Collectors.toList());
		System.out.println(eyeWords);
		
		List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseWords);
	}

}
