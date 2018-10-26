package my_practice;
class Demo_company {
	public static void main(String[] args) {
		Coder coder = new Coder("张三","00001",5000);
		coder.property();
		Manager manager = new Manager("李四","00221",80000,500);
		manager.property();
	}
}


abstract class Employee{
	private String name;
	private String number;
	private int salary;

	public Employee(){};
	public Employee(String name,String number,int salary){
		this.name = name;
		this.number = number;
		this.salary = salary;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setNumber(String number){
		this.number = number;
	}
	public String getNumber(){
		return number;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}
	abstract void property();
}

class Coder extends Employee{
	public Coder(){};
	public Coder(String name,String number,int salary){
		super(name,number,salary);
	}
	public void property(){
		System.out.println("我的姓名是：" + this.getName() + "，工号：" + this.getNumber() + "，薪酬是：" + this.getSalary());
	}
}

class Manager extends Employee{
	private int bonus;

	public Manager(){};
	public Manager(String name,String number,int salary,int bonus){
		super(name,number,salary);
		this.bonus = bonus;
	}

	public void setBonus(int bonus){
		this.bonus = bonus;
	}
	public int getBonus(){
		return bonus;
	}

	public void property(){
		System.out.println("我的姓名是：" + this.getName() + "，工号：" + this.getNumber() + "，薪酬是：" + this.getSalary() + ",奖金是：" + this.getBonus());
	}
}

