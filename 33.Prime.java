import java.util.*;
class Prime
{
  public static void main(String a[])
{
	Scanner s = new Scanner(System.in);
	int i,j,k=0,n;
	n = s.nextInt();
	for(i=1;i<=n;i++)
	{
		if(n%i==0){
		k++;
		}
	}
		if(k==2){
		System.out.println("It is a Prime Number");
		}
		else{
		System.out.println("It is Composite Number");
		}
}
}