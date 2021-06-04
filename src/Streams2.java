import java.util.Arrays;
import java.util.List;

public class Streams2 {
	
	public static void main(String[] args) {
	
		List<String> words = Arrays.asList("hi", "hello","there","good");

		words.stream().forEach(System.out::println);
		
		
	}

}
