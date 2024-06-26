import java.util.*;
class king
{
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	int n,sum=0,terms;
	System.out.print("Enter the N value:");
	n = s.nextInt(); 
	terms=2*n+1;
	int[]fib=new int[terms];
	fib[0]=0;
	fib[1]=1;
	for(int i=2;i<terms;i++)
	{
	fib[i]=fib[i-1]+fib[i-2];
	}
	for(int i=0;i<terms;i+=2)
	{
	sum+=fib[i];
	}
	System.out.println("Sum of Fibonacci numbers at even indexes ="+sum);
}
}