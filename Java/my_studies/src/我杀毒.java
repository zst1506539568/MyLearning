import java.util.Scanner;

public class Œ“…±∂æ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int[] arr={};
		    int count=0;
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			for(int i=0;i<number-1;i++){
				arr[i]=scanner.nextInt();
			}
			for(int i=2;i<number;i++){
				if(arr[i-2]>arr[i-1]&&arr[i-1]>arr[i] || arr[i-2]<arr[i-1]&&arr[i-1]<arr[i]){
					arr[i]=1000;
					count++;
				}
				newArr(arr,number);
			}
			System.out.println(count);
	}
//	
		public static int[] newArr(int[] arr,int number){
			int[] a={};
			int count=0;
			for(int i=0;i<number;i++){
				if(arr[i]!=1000){
					count++;
				}
			}
			return a;
		}

}
