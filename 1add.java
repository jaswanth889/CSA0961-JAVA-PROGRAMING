import java.util.*;
class Add
{
	int a,b,c;
	void get(int x, int y){
		a = x;
		b = y;
		}
	void Cal(){
		c = a+b;
		}
	void display(){
		System.out.println("Addition:"+c);
		}
public static void main(String arg[]){
	Add m = new Add();
	m.get(2,3);
	m.Cal();
	m.display();
	}
}