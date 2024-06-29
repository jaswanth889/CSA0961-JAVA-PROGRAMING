import java.util.*;
class Electricity
{
	int a,b,c,k;
	String name;
	double cost;
	void get(int x, int y, int z, String v){
		a = x;
		b = y;
		c = z;
		name = v;
		}
	void Cal(){
		k = b-c;
		if(k<=100){
		cost = k*1;
		}
		else if(k>100 && k<=200){
		cost = k*2.5;
		}
		else if(k>200 && k<=500){
		cost = k*4;
		}
		else if(k>500){
		cost = k*6;
		}
		}
	void display(){
		System.out.println("Bill:"+cost);
		}
public static void main(String arg[]){
	Electricity m = new Electricity();
	m.get(10203,405,300,"Jayaram");
	m.Cal();
	m.display();
	}
}