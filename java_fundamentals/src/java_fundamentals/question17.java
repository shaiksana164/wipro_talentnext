package java_fundamentals;
import java.util.*;

public class question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i<=99;i++) {
			boolean isvalid=true;
			for(int j=2;j<Math.sqrt(i);j++) {
				if(i%j==0) {
					isvalid=false;
					break;
				}
			}
			if(isvalid) {
				System.out.print(i+" ");
			}
		}

	}




	}


