import java.util.*;
class Fibinacci extends Thread{
	public void run(){
		int n1 = 0, n2 = 1, n3,i,n=6;
		System.out.print(n1+" " +n2+" ");
		for(i=2;i<n;i++){
		n3 = n1 + n2;
		System.out.print(n3+" ");
		n1 = n2;
		n2 = n3;
		}
	}	
}
class Display extends Thread{ 
	public void run(){
		int i,k=6;
		for(i=k;i>0;i--)
		System.out.print(i);
		}
}
class king{
	public static void main(String arg[]){
		Fibinacci m = new Fibinacci();
		Display n = new Display();
		m.start();
		n.start();
} 
}