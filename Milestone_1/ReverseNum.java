import java.util.*;
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rem = 0;
		int rev =0;
		System.out.println("Enter the number : ");
		int n1 = sc.nextInt();
		for(;n1!=0;n1=n1/10)
		{
			rem = n1%10;
			rev = rev*10+rem;
			
		}
		System.out.println(rev);

	}

}
