import java.util.function.Predicate;
import java.util.*;

public class Predicates {
	
	public static List<String> allMatches(List<String> values,Predicate<String> decider)
	{
		List<String> l=new ArrayList<String>();
		for(String i:values)
		{
			if(decider.test(i))
			{
				l.add(i);
			}
		}
		return(l);
	}
	public static void main(String args[])
	{
		List<String> words = Arrays.asList("hi", "hello","there","bineeee","be");
		
		List<String> shortWords = Predicates.allMatches(words, s -> s.length() < 4);
		
		List<String> wordsWithB = Predicates.allMatches(words, s -> s.contains("b"));
		
	    List<String> evenLengthWords = Predicates.allMatches(words, s -> (s.length() % 2) == 0);
		
        System.out.println(shortWords);
        System.out.println(wordsWithB);
        System.out.println(evenLengthWords);
	}

}
