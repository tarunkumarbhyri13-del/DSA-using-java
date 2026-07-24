
import java.util.*;
public class Armstrongnum
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int num=sc.nextInt();
		int org=num;
		int count=0;
		int temp=num;
	while(temp>0) {
	    count++;
	    temp=temp/10;
	}
	int sum=0;
	temp=num;
	while(temp>0){
	    int digit=temp%10;
	    sum+=Math.pow(digit,count);
	    temp=temp/10;
	}
	if(sum==org){
	    System.out.println(org+" is a armstrong number");
	}
	else{
	    System.out.println(org+" is not a armstrong number");
	}
	}
}

