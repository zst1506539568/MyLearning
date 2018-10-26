package demo_exception;

public class Demo_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Div d = new Div();
		try{
			int x = d.div(10, 0);
			System.out.println(x);
		}catch(Exception e){
			System.out.println(e.getMessage());      //获取错误信息
			System.out.println(e.toString());        //获取错误名和错误信息
			e.printStackTrace();                     //jvm默认的方式
			System.out.println("error:除数为0");
		}finally{
			System.out.println("执行了finally");
		}

	}

}


class Div{
	public int div(int a,int b){
		return a / b; 
	}
}