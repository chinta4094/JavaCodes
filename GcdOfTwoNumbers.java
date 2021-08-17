
import java.util.*;

public class GcdOfTwoNumbers {
	public static void main(String[] args){
		int a = 18,b = 24;
		int gcd;
		while(a > 0){
			gcd = b % a;
			b = a;
			a = gcd;
			if(gcd == 0){
				System.out.println(b);
			}
		}
	}
}
