/*Write a program that accepts two strings as command line 
arguments and generate the output in the required format*/
import java.util.Scanner;
public class StringInput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		s1 = sc.nextLine();
		System.out.println("Enter second string");
		s2 = sc.nextLine();
		System.out.println(s1+ " Technologies " +s2);
		

	}

}
