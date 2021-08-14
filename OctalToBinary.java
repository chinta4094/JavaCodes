
import java.util.*;

public class OctalToBinary {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Binary Number : ");
		int binary = sc.nextInt();
		int bi = binary;
		int weight = 1;
		int sum;
		int decimal = 0;
		while(binary > 0)
		{
			sum = binary % 10;
			decimal = decimal + sum * weight;
			weight = weight * 2;
			binary = binary / 10;
		}
		System.out.println("Decimal Of " + bi + " is : " + decimal);
		int deci = decimal;
		int sum1;
		int k = 0;
		int[] oct = new int[20];
		while(decimal > 0)
		{
			sum1 = decimal % 8;
			oct[k] = sum1;
			decimal = decimal / 8;
			k++;
		}
		System.out.print("Octal of " + deci + " is : " );
		for(int i=k-1;i>=0;i--)
		{
			System.out.print(oct[i]);
		}
		int octal = 0;
		int sum2;
		int weight1 = 1;
		for(int i=0;i<k;i++)
		{
			sum2 = oct[i] % 10;
			octal = octal + sum2 * weight1;
			weight1 = weight1 * 8;
		}
		System.out.println("\nOctal To Decimal : " + octal);
	}
}
