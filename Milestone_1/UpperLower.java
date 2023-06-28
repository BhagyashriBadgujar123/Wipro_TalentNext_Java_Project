import java.util.*;

public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();
		if(Character.isLowerCase(c.charAt(0)))
		{
			System.out.println(Character.toUpperCase(c.charAt(0)));
		}
		else
		{
			System.out.println(Character.toLowerCase(c.charAt(0)));
		}
		
	}

}
