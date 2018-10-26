package Demo_Stack;

import java.util.LinkedList;

public class Stack extends LinkedList{
	LinkedList linkedList = new LinkedList();
	public Stack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LinkedList Pull(){
		linkedList.removeFirst();
		System.out.println(linkedList);
		return linkedList;
	}
	
	public void Push(String l){
		linkedList.addFirst(l);	
		System.out.println(linkedList);
	}

}
