package my_practice;
/*class Extends {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("����");
		cat.age = 10;
		cat.feed();
		System.out.println("Name = " + cat.getName() + "Age = " + cat.age);
	}
}


class Animals{
	private String name;
	int age;

	public void feed(){
		System.out.println("��");
	}

	public void setName(String name ){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}
class Cat extends Animals {};*/
class Fu {
	static {
		System.out.println("��̬�����Fu");
	}

	{
		System.out.println("��������Fu");
	}

	public Fu() {
		System.out.println("���췽��Fu");
	}
}

class Zi extends Fu {
	static {
		System.out.println("��̬�����Zi");
	}

	{
		System.out.println("��������Zi");
	}

	public Zi() {
		System.out.println("���췽��Zi");
	}
}
class Extends {
	public static void main(String[] args) {
		Zi z = new Zi();
	}
}