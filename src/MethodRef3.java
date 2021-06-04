
public class MethodRef3 {
	
	public static <T> T betterEntry(T s1,T s2,TwoElementPredicate<T> decider)
	{
		if(decider.isFirstBetterThanSecond(s1, s2)) {
			return s1;
		}else {
			return s2;
		}
	}
	public static void main(String[] args)
	{

		String better = betterEntry("hi", "hello", (x,y) -> x.length() > y.length());
		System.out.println(better);

	}

}
