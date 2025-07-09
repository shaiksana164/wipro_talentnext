package java_fundamentals;
import java.util.Scanner;

public class question30 {
	public static void removeTens(int arr[]) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=10) {
				arr[index++]=arr[i];	
			}
		}
		while(index<arr.length) {
			arr[index++]=0;
		}
	}


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		removeTens(arr);
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}



		
	
