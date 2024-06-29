import java.util.*;
class Add
{
	int a,b,c,d;
	void sum(int x, int y){
		int sum = x+y;
		System.out.println("Addition:"+sum);
		}
	void sum(int x, int y, int z){
		int sum = x+y+z;
		System.out.println("Addition:"+sum);
		}
public static void main(String arg[]){
	Add m = new Add();
	m.sum(1,2);
	m.sum(1,2,3);
	}
}