
import java.util.function.Function;
import java.util.*;

public class Predicates4 {
	
	public static <T,E> List<E> transformedList(List<T> values,Function<T,E> decider)
	{
		List<E> l=new ArrayList<E>();
		for(T i:values)
		{
				E b= decider.apply(i);
				l.add(b);
			
		}
		return(l);
	}
	public static void main(String args[])
	{
		List<String> words = Arrays.asList("hi", "hello","there","bineeee","be");
		
		List<String> excitingWords = Predicates4.transformedList(words, s -> s + "!");
		
		List<String> upperCaseWords = Predicates4.transformedList(words, String::toUpperCase);
		
		System.out.println(excitingWords);
		
		System.out.println(upperCaseWords);
		
		System.out.println("-----------");
		
		
		List<Integer> wordLengths = Predicates4.transformedList(words, String::length);
		System.out.println(wordLengths);
       
	}
}

