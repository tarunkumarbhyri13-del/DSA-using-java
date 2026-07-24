
public class Largestsum
{
	public static void main(String[] args) {
	    int [] arr={-2,1,-3,4,-1,2,1,-5,4};
	    int currentsum=0;
	    int maxsum=Integer.MIN_VALUE;
	    for(int i=0;i<arr.length;i++){
	        currentsum+=arr[i];
	        maxsum=Math.max(maxsum,currentsum);
	        if(currentsum<0){
	            currentsum=0;
	        }
	    }
	    System.out.println(maxsum);
	}
}