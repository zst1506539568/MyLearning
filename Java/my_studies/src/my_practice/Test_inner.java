package my_practice;
class Test_inner {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}


//����Ҫ�󣬲������
interface Inter { 
	void show(); 
	}


class Outer {
	public static Outer method(){
		Outer s = new Outer();
		return s;
	}
	public static void show(){
		System.out.println("HelloWorld");
	}
	
}

	


class OuterDemo {
	public static void main(String[] args) {
		  Outer.method().show();
	  }
}
//Ҫ���ڿ���̨�����HelloWorld��
