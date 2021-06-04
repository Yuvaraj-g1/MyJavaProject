import java.util.*;
public class LamdaDemo {
	
	
	
	public static void main(String[] args) {
		
		String[] listt= {"Hiii","There","Hellooo","Good"};
		
		Arrays.sort(listt,(s1,s2) ->  s1.length()-s2.length() );
		
		System.out.println(Arrays.asList(listt));
		
		
		
		Arrays.sort(listt, (s1,s2) -> {
			if(s1.contains("e") && !s2.contains("e")) {
				return -1;
			}else if(s2.contains("e") && !s1.contains("e")) {
				return 1;
			}
			return 0;
		});
		
		System.out.println(Arrays.asList(listt));

	}

}
