import java.util.*;
public class PercentageInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String gender;
		int age;
		System.out.println("Enter the gender");
		gender = sc.nextLine();
		System.out.println("Enter the age");
		age = sc.nextInt();
		if(gender=="Female"&&age>=1&&age<=58)
		{
			System.out.println("Percentage of interest is 8.2%");
		}
		else if(gender=="Female"&&age>=59&&age<=100)
		{
			System.out.println("Percentage of interest is 9.2%");
		}
		else if(gender=="Male"&&age>=1&&age<=58)
		{
			System.out.println("Percentage of interest is 8.4%");
		}
		else if(gender=="Male"&&age>=59&&age<=100)
		{
			System.out.println("Percentage of interest is 10.5%");
		}
		

	}

}
