import java.util.*;
public class MinMax2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l1,l2,temp;
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int t;
		int m1 = arr[0];
		int m2 = arr[1];
		l1 = arr[0];
		l2 = arr[1];
		if(m1>m2)
		{
			t = m1;
			m1 = m2;
			m2 = t;
		}
		for(int i=2;i<n;i++)
		{
			if(arr[i]<m1)
			{
				m2 = m1;
				m1 = arr[i];
			}
			else if(arr[i]<m2&&arr[i]!=m1)
			{
				m2 = arr[i];
			}
		}
		if(l1<l2)
		{
			temp = l1;
			l1 = l2;
			l2 = temp;
		}
		for(int i=2;i<n;i++)
		{
			if(arr[i]>l1)
			{
				l2 = l1;
				l1 = arr[i];
			}
			else if(arr[i]>l2&&arr[i]!=l1)
			{
				l2 = arr[i];
			}
		}
		System.out.println("First Largest : "+ l1);
		System.out.println("Second Largest : "+ l2);
		System.out.println("First Smallesr : "+ m1);
		System.out.println("Second Smallest : "+ m2);
		
		

	}

}
