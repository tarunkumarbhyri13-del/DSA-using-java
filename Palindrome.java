
import java.util.*;
public class Palindrome
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int num=sc.nextInt();
		int org=num;
		int rev=0;
	while(num>0) {
	    int digit=num%10;
	    rev=rev*10+digit;
	    num=num/10;
	}
	if(org==rev)
	{
	    System.out.println("palindrome number");
	}
	else{
	    System.out.println("not a palindrome number");
	}
	}
}
	