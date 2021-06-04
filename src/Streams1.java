import java.util.*;
public class Streams1 {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("hi", "hello","there","good");

		words.stream().forEach(x->System.out.printf("  %s\n",x));
		
	}

}
