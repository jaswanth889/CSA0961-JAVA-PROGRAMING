import java.util.*;
class Eleven extends Thread{ 
	public void run(){
		int i;
		for(i=1;i<=10;i++){
		System.out.println("11*"+i+"="+i*11);
		}
	}
}
class Nine extends Thread{ 
	public void run(){
		int i;
		for(i=1;i<=10;i++){
		System.out.println("9*"+i+"="+i*9);
		}
	}
}
class king{
	public static void main(String arg[]){
		Eleven m = new Eleven();
		Nine n = new Nine();
		m.start();
		n.start();
} 
}