import java.util.*;
public class BiggestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int m = sc.nextInt();
		System.out.println("Enter no of columns");
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		//int temp=0;
		
		System.out.println("Enter the array element");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
			/*if(arr.length!=9)
			{
				System.out.println("Please enter 9 integer number");
				
			}*/
		}
		int largest=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++){
				if(arr[i][j]>largest)
				{
					largest = arr[i][j];
				}
			}
		}
		System.out.println("Largest element is : "+largest);
		

	}

}
