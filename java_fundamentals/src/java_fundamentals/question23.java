package java_fundamentals;
import java.util.*;

public class question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numbers[] = {42, 17, 68,3, 99, 25, 7 };
		int min = numbers[0];
		int max = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
	    
	System.out.println("Minimum value: " + min);
	System.out.println("Maximum value: " + max);
}
}
			
		
