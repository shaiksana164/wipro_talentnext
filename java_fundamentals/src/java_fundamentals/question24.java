package java_fundamentals;
import java.util.Scanner;

public class question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int[] arr=new int[n];
				for(int i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				for(int m:arr) {
					System.out.print((char)m);
				}

			}

		}
	


