import java.util.*;
public class SumAllDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int rem =0;
		int n1 = sc.nextInt();
		while(n1!=0){
		rem = n1%10;
		sum = sum + rem;
		n1 = n1/10;
		//System.out.println(sum);
		
		}
		System.out.println(sum);
		
	}

}
