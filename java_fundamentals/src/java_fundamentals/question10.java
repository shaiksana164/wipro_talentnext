package java_fundamentals;
import java.util.*;
public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int age=sc.nextInt();
		if(str=="Female" && (age <=1 && age >58)) {
			System.out.println("percentage of interest is 8.2%");
		}
		else if (str=="Female" && (age <=59 && age >100)) {
			System.out.println("Percentage of interest is 9.2%");
		}
		else if(str=="Male" && (age <=1 && age>58)) {
			System.out.println("Percentage of interest is 8.4%");
		}
		else {
			System.out.println("Percentage is 10.5%");
		}

	}




	}


