package my_practice;
class ��̬ {
	public static void main(String[] args) {
		method(new Cat());
		method(new Dog());
	}
	public static void method(Animals a)
	{
		if(a instanceof Cat){
			Cat c = (Cat) a;
			c.eat();
			c.CatchMouse();
		}else if(a instanceof Dog){
			Dog d = (Dog) a;
			d.eat();
			d.LookHome();
		}
			
	}
}

class Animals {
	public void eat(){
		System.out.println("��");
	}
}


class Cat extends Animals {
	public void eat(){
		System.out.println("è����");
	}
	public void CatchMouse(){
		System.out.println("ץ����");
	}
}

class Dog extends Animals{
	public void eat(){
		System.out.println("������");
	}
	public void LookHome(){
		System.out.println("������");
	}
}