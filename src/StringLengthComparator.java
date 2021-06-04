import java.util.*;

public class StringLengthComparator implements Comparator<String> {
	
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}



  
  private static void sortStringArrayWithComparator(String[] strings) {
		System.out.println(Arrays.asList(strings));

		//Arrays.sort(strings,new StringLengthComparator());
		
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});

		System.out.println(Arrays.asList(strings));

  }
}