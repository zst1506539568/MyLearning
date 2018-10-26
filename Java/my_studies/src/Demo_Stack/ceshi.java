package Demo_Stack;

import java.util.LinkedList;

public class ceshi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.Push("zhang");
		stack.Push("li");
		stack.Push("wang");
		stack.Pull();
		stack.Pull();
		stack.Push("zhou");
		stack.Pull();	
	}

}
