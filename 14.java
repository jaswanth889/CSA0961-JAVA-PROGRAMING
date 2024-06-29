import java.util.*;
class Arm extends Thread{ 
	public void run(){
	Scanner s = new Scanner(System.in);
	int r=0,i,n,c,k=0;
	n = 143;
	System.out.println("Enter the Number:"+n);
	c=n;
	while(n!=0)
	{
		n = n/10;
		k++;
	}
	n=c;
	while(n!=0)
	{
		i = n%10;
		r += Math.pow(i,k);
		n = n/10;
	}
	if(c==r)
	System.out.println("It is a Armstrong Number");
	else
	System.out.println("It is NOT a Armstrong Number");
	}
}
class Fib extends Thread{ 
	public void run(){
	int n1=0,n2=1,n3,i,count=10;    
 	System.out.print(n1+" "+n2);
 	for(i=2;i<count;++i) 
 	{    
  	n3=n1+n2;    
  	System.out.print(" "+n3);    
  	n1=n2;    
  	n2=n3;    
 	}   
	}
}
class GOAT{
	public static void main(String arg[]){
		Arm m = new Arm();
		Fib n = new Fib();
		m.start();
		n.start();
} 
}