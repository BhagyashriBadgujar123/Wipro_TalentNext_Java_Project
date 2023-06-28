/*Write a program to check the given number is positive, negative, zero*/
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		if(n1==0)
		{
			System.out.println("Zero");
		}
		else if(n1<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Positive");
		}
		
		

	}

}
