import java.util.*;
class Rectangle
{
	int a,b,c,d;
	void get(int x, int y){
		a = x;
		b = y;
		}
	void Cal(){
		c = a*b;
		d = 2*(a+b);
		}
	void display(){
		System.out.println("Area:"+c);
		System.out.println("Perimeter:"+d);
		}
public static void main(String arg[]){
	Rectangle m = new Rectangle();
	m.get(2,3);
	m.Cal();
	m.display();
	}
}