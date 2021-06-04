import java.util.function.Predicate;
import java.util.*;

public class Predicates2<T> {
	
	public static <T> List<T> allMatches(List<T> values,Predicate<T> decider)
	{
		List<T> l=new ArrayList<T>();
		for(T i:values)
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
		
		List<String> shortWords = Predicates2.allMatches(words, s -> s.length() < 4);
		
        System.out.println(shortWords);
		
		List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
	
		List<Integer> bigNums = Predicates2.allMatches(nums, n -> n > 500);
		
        System.out.println(bigNums);
       
	}
}

