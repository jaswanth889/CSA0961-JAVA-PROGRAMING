import java.util.*;
class A
{
	int a,b,c;
	void getA(){
		a = 10;
		b = 20;
		}
	void CalA(){
		c = a+b;
		System.out.println("Addition:"+c);
		}
	}
class B extends A{
	int d,e;
	void getB(){
		d = 40;
		}
	void CalB(){
		e = c+d;
		System.out.println("Addition:"+e);
		}
public static void main(String arg[]){
	B m = new B();
	m.getA();
	m.CalA();
	m.getB();
	m.CalB();
	}
}