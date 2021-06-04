import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;

public class Streams6 {
	
	public static void main(String[] args) {
		
		double[] res = new Random().doubles(10).toArray();
		System.out.println(Arrays.asList(res));
		
		double sum1=DoubleStream.of(res).sum();
		System.out.println(sum1);
		
		double sum2=DoubleStream.of(res).parallel().sum();
		System.out.println(sum2);
	}	

}
