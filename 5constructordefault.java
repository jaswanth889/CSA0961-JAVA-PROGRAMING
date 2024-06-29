import java.util.*;
class Box
{
	int a,b,c,d;
	Box(){
		a = 1;
		b = 2;
		c = 3;
		}
	void Cal(){
		d = a*b*c;
		}
	void display(){
		System.out.println("Volume:"+d);
		}
public static void main(String arg[]){
	Box m = new Box();
	m.Cal();
	m.display();
	}
}