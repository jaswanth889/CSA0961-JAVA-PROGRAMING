import java.util.*;
class Student{
	int a,b,c,d,e,reg,sum,avg;
	String j;
	Student(int x, int y, int z, int w, int v, int u, String k){
		a = x;
		b = y;
		c = z;
		d = w;
		e = v;
		reg = u;
		j = k;
		}
	void Cal(){
		sum = a+b+c+d+e;
		avg = sum/5;
		}
	void display(){
		System.out.println("Total Marks:"+sum);
		System.out.println("Average:"+avg);
		}
public static void main(String arg[]){
	Student m = new Student(98,99,97,87,92,192210314,"JAYARAM");
	m.Cal();
	m.display();
	}
}