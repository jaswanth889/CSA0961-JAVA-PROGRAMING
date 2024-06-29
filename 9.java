import java.util.*;
class Marks{
	int m1,m2,m3,m4,m5,m6;
	double To,Av,G;
	void get(){
		Scanner s = new Scanner(System.in); 
		System.out.print("Enter the marks in python:");
		m1 = s.nextInt();
		System.out.print("Enter the marks in C Programming:");
		m2 = s.nextInt();
		System.out.print("Enter the marks in Mathematics:");
		m3 = s.nextInt();
		System.out.print("Enter the marks in Physics:");
		m4 = s.nextInt();
		System.out.print("Enter the marks in Chemistry:");
		m5 = s.nextInt();
		System.out.print("Enter the marks in Professional Ethics:");
		m6 = s.nextInt();

	}
}
class Percentage extends Marks{
	void Total(){
		To = m1+m2+m3+m4+m5+m6;
		System.out.println("Total Marks Scored:"+To);
		}
	void Aggregate(){
		Av = To/6;
		System.out.println("Percentage Scored:"+Av);
		}
}
class Grade extends Percentage{
void Grade(){
	if(Av>75){
	System.out.println("Grade Scored: Distinction");
	}
	else if(Av<75 && Av>60){
	System.out.println("Grade Scored: First Division");
	}
	else if(Av<60 && Av>50){
	System.out.println("Grade Scored: Second Division");
	}
	else if(Av<50 && Av>40){
	System.out.println("Grade Scored: Third Division");
	}
	else if(Av<40){
	System.out.println("Grade Scored: FAIL");
	}

}
public static void main(String arg[]){
	Grade m = new Grade();
	m.get();
	m.Total();
	m.Aggregate();
	m.Grade();
}
}