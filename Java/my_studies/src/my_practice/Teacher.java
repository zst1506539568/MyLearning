/*
�������й��̣�
	1.javac -d . Staff.java
	2.javac -d . Teacher.java
	3.java coom.siting.Teacher
	�ඨ��Ϊpublicʱ���ļ���������������ͬ�����򱨴� xx���ǹ����� Ӧ����Ϊxx���ļ�������

*/


package my_practice;
import my_practice.Staff;
class Teacher {
	public static void main(String[] args) {
		Staff employee = new Staff("����",21);
		System.out.println(employee.getName() + "..." + employee.getAge());
	}
}
