/*Write a program to check the given number is odd or even*/
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		if(n1/2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}
