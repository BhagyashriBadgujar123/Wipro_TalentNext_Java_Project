import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row of array");
		int i = sc.nextInt();
		System.out.println("Enter row of array");
		int j = sc.nextInt();
		int arr[][] = new int[i][j];
		for(int m = 0;m<arr.length;m++)
		{
			for(int n = 0;n<arr.length;n++)
			{
				arr[m][n] = sc.nextInt();
			}
		}
		int temp = arr[0][0];
		arr[0][0] = arr[1][1];
		arr[1][1] = temp;
		
		temp = arr[0][1];
		arr[0][1] = arr[1][0];
		arr[1][0] = temp;
		
		System.out.println("Printing Reversed Array");
		for(int m=0;m<arr.length;m++)
		{
			for(int n=0; n<arr[m].length;n++)
			{
				System.out.print(arr[m][n]+" ");
			}
			System.out.println();
		}
		 /*for (int m = 0; m < i; m++) {
			  
		        // Initialise start and end index
		        int start = 0;
		        int end = j - 1;
		  
		        // Till start < end, swap the element
		        // at start and end index
		        while (start < end) {
		  
		            // Swap the element
		            int temp = arr[m][start];
		            arr[m][start] = arr[m][end];
		            arr[m][end] = temp;
		  
		            // Increment start and decrement
		            // end for next pair of swapping
		            start++;
		            end--;
		        }
		    }
		  
		    // Print the arr[][] after
		    // reversing every row
		    for (int m = 0; m < i; m++) {
		        for (int n = 0; n < j; n++) {
		            System.out.print(arr[m][n] + " ");
		        }
		        System.out.println();
		    }
		    
		    for(int m = 0;m<j;m++)
		    {
		    	for(int n=0;n<i;n++)
		    	{
		    		System.out.print(arr[m][n] + " ");
		    	}
		    	System.out.println();
		    }*/

	}

}
