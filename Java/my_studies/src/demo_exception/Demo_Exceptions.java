package demo_exception;

public class Demo_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Div d = new Div();
		try{
			int x = d.div(10, 0);
			System.out.println(x);
		}catch(Exception e){
			System.out.println(e.getMessage());      //��ȡ������Ϣ
			System.out.println(e.toString());        //��ȡ�������ʹ�����Ϣ
			e.printStackTrace();                     //jvmĬ�ϵķ�ʽ
			System.out.println("error:����Ϊ0");
		}finally{
			System.out.println("ִ����finally");
		}

	}

}


class Div{
	public int div(int a,int b){
		return a / b; 
	}
}