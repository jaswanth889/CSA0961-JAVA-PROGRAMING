import java.util.*;
class GOAT
{
	public static void main(String a[])
{
	Scanner s = new Scanner(System.in);
	int rev=0,i,n;
	System.out.println("Enter the Number:");
	n = s.nextInt();
	while(n!=0)
	{
		i = n%10;
		rev = rev*10 + i;
		n = n/10;
	}
	System.out.println("The Number After Reverse:"+rev);
}
}