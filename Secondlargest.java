
public class Secondlargest
{
	public static void main(String[] args) {
		int [] arr={10,45,23,67,89,54};
		int largest=Integer.MIN_VALUE;
		int second_lar=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]>largest){
		        second_lar=largest;
		        largest=arr[i];
		    }
		    else if(arr[i]>second_lar&&arr[i]!=largest){
		        second_lar=arr[i];
		    }
		}
		if(second_lar==Integer.MIN_VALUE){
		    System.out.println("second largest element is not found");
		}
		else{
		    System.out.println("largest:"+ largest);
		    System.out.println("second largest:"+ second_lar);
		}
		
	}
}