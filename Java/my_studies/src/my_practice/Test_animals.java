package my_practice;
class Test_animals {
	public static void main(String[] args) {
		Cat1 cat = new Cat1();
		cat.setName("miao");
		cat.setAge(10);
		cat.eat();
		cat.catchfish();
		System.out.println(cat.getName() + "..." + cat.getAge());
		System.out.println("-------------------------------");
		Dog1 dog = new Dog1("wang",12);
		dog.eat();
		dog.lookhome();
		System.out.println(dog.getName() + "..." + dog.getAge());
	}
}


class Animals1 {
	private String name;
	private int age;

	public Animals1(){};

	public Animals1(String name,int age){
		this.age = age;
		this.name = name;
	}
	public void eat(){
		System.out.println("吃饭");
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}
}

class Dog1 extends Animals1{
	public Dog1(){};

	public Dog1(String name,int age){
		super(name,age);
	}

	public void lookhome(){
		System.out.println(super.getName() + "会看家");
	}
}

class Cat1 extends Animals1{
	public Cat1(){};

	public Cat1(String name,int age){
		super(name,age);
	}
	public void catchfish(){
		System.out.println(super.getName() + "会抓鱼");
	}
}
