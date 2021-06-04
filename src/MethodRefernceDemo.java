import java.util.Arrays;

public class MethodRefernceDemo {
	
	public static int eChecker(String s1,String s2)
	{
		if(s1.contains("e") && !s2.contains("e")) 
		{
			return -1;
		}
		else if(s2.contains("e") && !s1.contains("e")) {
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
	
		String[] listt= {"Hiii","There","Hellooo","Good"};
		
		Arrays.sort(listt,MethodRefernceDemo::eChecker);
		
		System.out.println(Arrays.asList(listt));
		
		/*
		 * if method is not static
		 * 
		 * Method is not static
		 * 
		 * MethodRefernceDemo obj =new Metho....();
		 * Arrays.sort(listt , obj::eChecker);
		 * 
		 */
		
	
	}

}
