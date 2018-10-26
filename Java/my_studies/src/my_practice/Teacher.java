/*
编译运行过程：
	1.javac -d . Staff.java
	2.javac -d . Teacher.java
	3.java coom.siting.Teacher
	类定义为public时，文件名必须与类名相同，否则报错： xx类是公共的 应在名为xx的文件中声明

*/


package my_practice;
import my_practice.Staff;
class Teacher {
	public static void main(String[] args) {
		Staff employee = new Staff("张三",21);
		System.out.println(employee.getName() + "..." + employee.getAge());
	}
}
