import java.util.*;
public class PallindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1,rem=0,rev=0;
		int temp;
		n1 = sc.nextInt();
		temp=n1;
		for(;n1!=0;n1=n1/10)
		{
			rem = n1%10;
			rev = rev*10+rem;
		}
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		

	}

}
