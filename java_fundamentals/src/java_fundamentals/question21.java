package java_fundamentals;
import java.util.*;

public class question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(n==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		

	}

}



