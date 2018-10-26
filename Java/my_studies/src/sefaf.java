import java.util.Scanner;

public class sefaf {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] num = input.split(",");
		int[] number = new int[num.length];
//		int[] number = {};
		for(int i=0; i<num.length ;i++){
			number[i] = Integer.parseInt(num[i]);
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("请输入一串整数并在输入时用英文逗号隔开："); 
//		String inputString = in.next(); 
//		String[] stringArray = inputString.split(","); 
//		int[] nums=new int[stringArray.length]; 
//		for(int i=0;i<stringArray.length;i++){ 
//			nums[i]=Integer.parseInt(stringArray[i]); 
//			System.out.print(nums[i]+" "); 
//			} 
//		in.close();
	
		
			
			
	}

}
