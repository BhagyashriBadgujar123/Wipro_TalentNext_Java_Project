import java.util.*;
public class SucceedingOrder {

	static void conditionalSum(int ar[],int a, int b)
	{
		int sum = 0;
		boolean add = true;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=a&&add==true)
			{
				sum = sum+ar[i];
			}
			else if(ar[i]==a)
			{
				add=false;
				
			}
			else if(ar[i]==b)
			{
				add=true;
				//i++;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 6;
		int b = 7;
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		conditionalSum(ar,a,b);
	}

}
