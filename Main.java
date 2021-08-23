
import javax.crypto.spec.PSource;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int num = 16;
		int n = (num / 2) + 1;
		int x = 0;
		int count = 0;
		for(int i=0;i<n;i++)
		{
			if(i<=n/2)
			{
				x = x + 1;
				System.out.print(x + " ");
				count++;
			}
			if(i>n/2)
			{
				x = x -1;
				System.out.print(x + " ");
				count++;
			}

		}
		System.out.print("\n" + count);

	}
}
