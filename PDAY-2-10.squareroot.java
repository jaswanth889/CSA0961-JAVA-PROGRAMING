import java.util.*;
import java.lang.Math;
class king
{
  public static void main(String n[])
{
	Scanner s = new Scanner(System.in);
	int i, a, flag = 0;
	a = s.nextInt();
	for(i=0;i<=a;i++){
		if(Math.pow(i,2)==a){
		System.out.println("Square Root:"+i+" ,-"+i);
		}
	}
}
}
