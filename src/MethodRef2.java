import java.util.*;
public class MethodRef2 {
	
	public static String betterString(String s1,String s2,TwoStringPredicate decider)
	{
		if(decider.isFirstBetterThanSecond(s1, s2)) {
			return s1;
		}else {
			return s2;
		}
	}
	public static void main(String[] args)
	{

		String better = betterString("hi", "hello", (x,y) -> ((String) x).length() > ((String) y).length());
		System.out.println(better);

	}
}
