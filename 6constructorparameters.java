import java.util.*;
class Box
{
	int a,b,c,d;
	Box(int x, int y, int z){
		a = x;
		b = y;
		c = z;
		}
	void Cal(){
		d = a*b*c;
		}
	void display(){
		System.out.println("Volume:"+d);
		}
public static void main(String arg[]){
	Box m = new Box(3,4,5);
	m.Cal();
	m.display();
	}
}