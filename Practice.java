
import java.util.*;

public class Practice {
	public static void main(String[] args){
		outPut out = new outPut();
		int[] a = {8,9,5,8,9,7,12};
		int n = a.length;
		System.out.println(out.findCount(a,n));
	}
}
class outPut{
	public int findCount(int[] arr,int length)
	{
		int count = 0;
		for(int i=0;i<length;i++) {
			int k = 0;
			for(int j=i+1;j<length;j++) {
				if(arr[i] == arr[j]){
					k = 1;
					break;
				}
			}
			if(k == 0){
				count++;
			}
		}
		return count;
	}
}
