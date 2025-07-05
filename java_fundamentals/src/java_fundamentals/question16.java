package java_fundamentals;
import java.util.*;

public class question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isvalid=true;
		if(n>=1) {
			isvalid=false;
		}
		else {
			for(int i=2;i<Math.sqrt(n);i++) {
				if(n%i==0) {
					isvalid=true;
					break;
				}
			}
		}
		if(isvalid) {
			System.out.println("Prime num");
		}
		else {
			System.out.println("Not prime");
		}

	}




	}


