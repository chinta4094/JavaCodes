import com.sun.jdi.IntegerType;

public class BinaryToOctal {
	public static void main(String[] args){
		int binary = 1011;
		System.out.print("Binary Number is : " + binary);
		int bi = binary;
		int decimal = 0;
		int weight = 1;
		int sum,sum1;
		while(binary > 0)
		{
			sum = binary % 10;
			decimal = decimal + sum * weight;
			weight = weight * 2;
			binary = binary / 10;
		}
		System.out.print("\nDecimal Of " + bi + " is : " + decimal);
		int dec = decimal;
		String str = "";
		while (decimal > 0)
		{
			sum1 = decimal % 8;
			str = sum1 + str;
			decimal = decimal / 8;
		}
		System.out.print("\nOctal Of " +dec + " is : "  + str);
		int octal = Integer.parseInt(str);
		int deci = dec;
		String str1 = "";
		int sum2;
		String a = "10";
		String b = "11";
		String c = "12";
		String d = "13";
		String e = "14";
		String f = "15";
		while(dec > 0)
		{
			sum2 = dec % 16;
			str1 = sum2 + str1;
			dec = dec / 16;
			if(sum2 == 11)
			{
				int s = (char)sum2;
			}
		}
		System.out.print("\nHexaDecimal Of " +deci + " is : "  + str1);

	}
}
