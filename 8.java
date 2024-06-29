import java.util.*;
class GOAT
{  
	public static int sum(int m)
{
	int rem,num;
	num = 0;
	while(m!=0)
	{
	rem = m%10;
	num = num +rem;
	m = m/10;
	}  
	return num;
} 
	public static void main(String args[])  
{    
	Scanner s = new Scanner(System.in);
	int k; 
 	System.out.println("Enter the n value:"); 
	int n = s.nextInt();
	k = sum(n);
	while(k>=10)
	{
	k = sum(k);
	}
	System.out.println("Sum of Digits:" +k);
}
}  