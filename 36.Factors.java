import java.util.*;
class Factors
{
  public static void main(String a[])
{
	Scanner s = new Scanner(System.in);
	int i,j,k=0,n;
	System.out.println("Enter the Number:");
	n = s.nextInt();
	System.out.println("Factors of "+n);
	for(i=1;i<=n;i++)
	{
		if(n%i==0){
		System.out.println(i);
		}
	}
}
}