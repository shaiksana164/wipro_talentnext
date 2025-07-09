package java_fundamentals;
import java.util.Scanner;
public class question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] numbers = {10, 20, 30, 40, 50};
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		double average = (double) sum / numbers.length;
		
		System.out.println("sum = " + sum);
		System.out.println("Average = " + average );
	}
}
		
