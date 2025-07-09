package java_fundamentals;
import java.util.*;

public class question33 {
	public static int[] middle(int[] a, int[]b) {
		return new int[] {a[1],b[1]};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a=new int[3];
		int[] b=new int[3];
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			b[i]=sc.nextInt();
		}
		int[] arr=middle(a,b);
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}



		

	}


