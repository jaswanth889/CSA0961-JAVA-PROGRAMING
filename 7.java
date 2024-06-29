import java.util.*;
class GOAT{
	int m1;
	double To,Av,G;
	void get(){
		Scanner s = new Scanner(System.in); 
		System.out.print("Enter the loan Amount:");
		m1 = s.nextInt();
	}
	void SBI(){
		To = m1 * 0.84;
		System.out.println("Total Interest of SBI:"+To);
		}
	void ICIC(){
		Av = m1 * 0.73;
		System.out.println("Total Interest of ICIC:"+Av);
		}
	void AXIS(){
		G = m1 * 0.97;
		System.out.println("Total Interest of AXIS:"+G);
		}
public static void main(String arg[]){
	GOAT m = new GOAT();
	m.get();
	m.SBI();
	m.ICIC();
	m.AXIS();
}
}