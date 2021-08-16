
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] arr = {23,45,82,27,66,112,78,13,71,86};
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			int count = 0;
			for(int j=0;j<n;j++)
			{
				if(arr[i] > arr[j])
				{
					count++;
				}
			}
			if(count == (n-1))
			{
				System.out.println(arr[i]);
				System.out.println(i);
			}
		}
	}
}