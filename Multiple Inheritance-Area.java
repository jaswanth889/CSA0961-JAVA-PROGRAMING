import java.util.*;
class Shape{
	int r,l,h;
	double A,V,p;
	void get(int a, int b, int c, double d){
		r = a;
		l = b;
		h = c;
		p = d;
	}
}
class Sphere extends Shape{
	void VolS(){
		V = (4/3)*p*r*r*r;
		System.out.println("Volume of the Sphere:"+V);
		}
	void AreaS(){
		A = 4*p*r*r;
		System.out.println("Area of the Sphere:"+A);
		}
}
class Cone extends Sphere{
	void VolC(){
		V = (1/3)*p*r*r*h;
		System.out.println("Volume of the Cone:"+V);
		}
	void AreaC(){
		A = p*r*(l+r);
		System.out.println("Area of the Cone:"+A);
		}

}
class Cylinder extends Cone{
	void VolCy(){
		V = p*r*r*h;
		System.out.println("Volume of the Cylinder:"+V);
		}
	void AreaCy(){
		A = 2*p*r*(h+r);
		System.out.println("Area of the Cylinder:"+A);
		}
public static void main(String arg[]){
	Cylinder m = new Cylinder();
	m.get(2,3,1,3.14);
	m.VolS();
	m.AreaS();
	m.VolC();
	m.AreaC();
	m.VolCy();
	m.AreaCy();
}
}