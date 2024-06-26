import java.util.*;
class Marks{
	int m1,m2,m3,m4,m5,m6;
	double To,Av,G;
	void get(int a, int b, int c, int d, int e, int f){
		m1 = a;
		m2 = b;
		m3 = c;
		m4 = d;
		m5 = e;
		m6 = f;
	}
}
class Percentage extends Marks{
	void Total(){
		To = m1+m2+m3+m4+m5+m6;
		System.out.println("Total Marks Scored:"+To);
		}
	void Average(){
		Av = To/6;
		System.out.println("Percentage Scored:"+Av);
		}
}
class Grade extends Percentage{
void G(){
	if(Av<50){
	System.out.println("Grade Scored: FAIL");
	}
	else if(Av<60 && Av>50){
	System.out.println("Grade Scored: D");
	}
	else if(Av<70 && Av>60){
	System.out.println("Grade Scored: C");
	}
	else if(Av<80 && Av>70){
	System.out.println("Grade Scored: B");
	}
	else if(Av<90 && Av>80){
	System.out.println("Grade Scored: A");
	}
	else if(Av<100 && Av>90){
	System.out.println("Grade Scored: S");
	}	

}
public static void main(String arg[]){
	Grade m = new Grade();
	m.get(85,60,95,86,78,90);
	m.Total();
	m.Average();
	m.G();
}
}