package my_practice;
class Test_inner {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}


//按照要求，补齐代码
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
//要求在控制台输出”HelloWorld”
