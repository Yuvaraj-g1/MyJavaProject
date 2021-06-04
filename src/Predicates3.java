import java.util.function.Function;
import java.util.*;

public class Predicates3 {
	
	public static List<String> transformedList(List<String> values,Function<String,String> decider)
	{
		List<String> l=new ArrayList<String>();
		for(String i:values)
		{
				String b= decider.apply(i);
				l.add(b);
			
		}
		return(l);
	}
	public static void main(String args[])
	{
		List<String> words = Arrays.asList("hi", "hello","there","bineeee","be");
		
		List<String> excitingWords = Predicates3.transformedList(words, s -> s + "!");
		List<String> eyeWords = Predicates3.transformedList(words, s -> s.replace("i", "eye"));
		List<String> upperCaseWords = Predicates3.transformedList(words, String::toUpperCase);
		
		System.out.println(excitingWords);
		System.out.println(eyeWords);
		System.out.println(upperCaseWords);
       
	}
}

