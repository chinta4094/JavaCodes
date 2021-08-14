public class TwoDArraySort {
	public static void main(String[] args){
		int[][] arr = {
				{12,2,9,10},
				{3,0,9,29},
				{15,6,-32,1},
				{3,3,9,-4}

		};
		int[][] ar = new int[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				ar[i][j] = arr[i][j];
			}
		}
		for(int i=0;i<4;i++){
			int temp = 0;
			for(int j=0;j<4;j++){
				for(int k=j+1;k<4;k++)
				{
					if(arr[i][j] > arr[i][k])
					{
						temp = arr[i][j];
						arr[i][j] = arr[i][k];
						arr[i][k] = temp;
					}
				}
			}
		}
		int[] arr1 = new int[4];
		int a = 0;
		for(int i=0;i<4;i++)
		{
			arr1[i] = arr[i][3];
		}

		for(int i=0;i<4;i++){
			int temp = 0;
			for(int j=i+1;j<4;j++){
				if(arr1[i] > arr1[j]){
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				ar[0][0] = arr1[3];
				ar[0][3] = arr1[3];
				ar[3][0] = arr1[3];
				ar[3][3] = arr1[3];
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(ar[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
