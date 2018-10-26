package my_practice;
class Demo_Inner {
	public static void main(String[] args) {
		Outer1.inner1 i1 = new Outer1().new inner1();
		i1.print1();                             //一般内部类

		Outer1 i2 = new Outer1();

		Outer1.inner3 i3 = new Outer1.inner3();     //静态内部类的非静态方法    new的其实是inner的对象
		i3.print3();

		Outer1.inner4.print4();                    //静态内部类的静态方法

	
	}
}


class Outer1{
	private int num = 10;
	class inner1{
		public void print1(){
			System.out.println(num);
		}
	}

	private class inner2{
		public void print2(){
			System.out.println("2--------");
		}
	}

	static class inner3{
		public  void print3(){
			System.out.println("3...");
		}
	}


	static class inner4{
		public static void print4(){
			System.out.println("...");
		}
	}

	public void method(){
		inner2 inner = new inner2();
		inner.print2();
	}
}
