import java.util.*;
class Five extends Thread{ 
	public void run(){
		int i;
		for(i=1;i<=10;i++){
		System.out.println("5*"+i+"="+i*5);
		}
	}
}
class Ten extends Thread{ 
	public void run(){
		int i;
		for(i=1;i<=10;i++){
		System.out.println("10*"+i+"="+i*10);
		}
	}
}
class GOAT{
	public static void main(String arg[]){
		Five m = new Five();
		Ten n = new Ten();
		m.start();
		n.start();
} 
}