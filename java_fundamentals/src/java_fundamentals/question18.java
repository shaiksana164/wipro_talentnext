package java_fundamentals;
import java.util.*;

public class question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println(sum);
		

	}



	}


