import java.util.ArrayList;

public class GeeksForGeeks {
	public static void main(String[] args){
		int arr[] = {6,7,8,10};
		int queries[] = {0, 3, 1, 2};
		int q = 2;
		int mean = 0;
		int sum = 0;
		int count = 0;
		ArrayList<Integer> array = new ArrayList<Integer>(q);
		for(int i=0;i<queries.length - 1;i++)
		{
			int l = queries[i];
			int r = queries[i+1];
			for(int j=l;j<=r;j++)
			{
				sum += arr[j];
				count++;
			}
			System.out.println(sum);
			mean = sum / count;
			array.add(mean);
			i++;
			sum = 0;
			count = 0;
		}
		System.out.println(array);
	}
}
