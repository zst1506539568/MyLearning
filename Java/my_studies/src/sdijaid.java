import java.util.Scanner;

public class sdijaid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int sum=0;	
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String[] num = input.split(",");
	    int[] arr = new int[num.length]; 
	    for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(num[i]);
		}
		for(int i=1;i<arr.length-1;i++){
		    if(arr[i]-arr[i-1]==1){
		    sum=arr[i]+arr[i+1];
		    }
		}
	    System.out.println(sum);
		       	
	}

}
