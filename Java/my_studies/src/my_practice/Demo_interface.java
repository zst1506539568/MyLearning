package my_practice;
class Demo_interface {
	public static void main(String[] args) {
		JumpCat jumpcat = new JumpCat("LILI");
		jumpcat.eat();
		jumpcat.jump();


	}
}



class Cats{
	private String name;

	public Cats(){};
	public Cats(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
	public void eat(){
		System.out.println("√®≥‘”„");
	}

}

interface Jumping{
	public void jump();
}

class JumpCat extends Cats{
	public JumpCat(){};
	public JumpCat(String name){
		super(name);
	}

	public void jump(){
		System.out.println(this.getName() + "ª·Ã¯");
	}
}