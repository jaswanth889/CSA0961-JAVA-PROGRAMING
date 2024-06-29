import java.util.*;
class A
{
	int a;
	void get(){
		a = 20000;
		}
	void Cal(){
		System.out.println("Salary of Employee:"+a);
		}
	}
class Manager extends A{
	int ta, hra, total;
	void getM(){
		ta = 2000;
		hra = 10000;
		}
	void CalM(){
		total = ta + hra;
		System.out.println("Salary of Manager:"+total);
		}
public static void main(String arg[]){
	Manager m = new Manager();
	m.get();
	m.Cal();
	m.getM();
	m.CalM();
	}
}