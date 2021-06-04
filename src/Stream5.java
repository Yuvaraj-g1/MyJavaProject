import java.util.Arrays;
import java.util.List;

public class Stream5 {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("hi", "hello","there","goodie","bye");
		
		String res=words.stream().reduce("",(s1,s2)->(s1+s2).toUpperCase());
		System.out.println(res);

		String res1=words.stream().map(String::toUpperCase).reduce("",String::concat);
		System.out.println(res1);
		
		String res2=words.stream().reduce((s1,s2)->s1+','+s2).orElse("AddMoreThan2Elements");
		System.out.println(res2);
		

	}

}

/*
Part 2
For these exercises, start with a List of Strings similar to this:
• List<String> words = Arrays.asList("hi", "hello", ...);
1. Produce a single String that is the result of concatenating the uppercase versions of all of the
Strings. E.g., the result should be "HIHELLO...". Use a single reduce operation, without using map.
2. Produce the same String as above, but this time via a map operation that turns the words into upper
case, followed by a reduce operation that concatenates them.
3. Produce a String that is all the words concatenated together, but with commas in between. E.g., the
result should be "hi,hello,...". Note that there is no comma at the beginning, before “hi”, and also no
comma at the end, after the last word. Major hint: there are two versions of reduce we discussed
Part 3
1. Make a very large array of random doubles, each of which ranges from 0 to 1. A quick and easy
way to do this is with “new Random().doubles(size).toArray()”.
2. Compute the sum of the square roots of the numbers in the array. Find a shorter and simpler way
than making a loop to tally the sum. Hint: review the notes on number-specialized streams, especially
the fact that you make a DoubleStream from a double[] with DoubleStream.of, not Stream.of.
3. Repeat the process in parallel. Once you have #2 working, this should be very simple.
4. Verify that you get the “same” answer with the parallel approach as with the sequential approach.
Why do I have “same” in quotes in the previous sentence?

*/