public class BinaryToHex {
	public static void main(String[] args){
		int binary = 10110110;
		int decimal = 0;
		int bi = binary;
		int weight = 1;
		int sum;
		while (binary > 0)
		{
			sum = binary % 10;
			decimal = decimal + sum * weight;
			weight = weight * 2;
			binary = binary / 10;
		}
		System.out.println("Decimal Of " + bi + " is : " + decimal);
		int k = 0;
		int[] hex = new int[50];
		while(decimal > 0)
		{
			hex[k] = decimal % 16;
			decimal = decimal / 16;
			k++;
		}
		for(int i=k-1;i>=0;i--)
		{
			if(hex[i] > 9)
			{
				System.out.print((char)(hex[i] + 55));
			}
			else {
				System.out.print(hex[i]);
			}
		}
	}
}
