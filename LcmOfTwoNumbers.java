
import java.util.*;

public class LcmOfTwoNumbers {
	public static void main(String[] args){
		int a = 8,b = 12;
		int a1 = a,b1 = b;
		int gcd,lcm = 0;
		while(a > 0)
		{
			gcd = b % a;
			b = a;
			a = gcd;
			if(gcd == 0){
				System.out.println(b);
			}
		}
		lcm = (a1 * b1) / b;
		System.out.println(lcm);
	}
}
