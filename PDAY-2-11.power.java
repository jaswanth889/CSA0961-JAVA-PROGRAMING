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
		if(Math.pow(i,3)==a){
		flag = 1;
		}
	}
	if(flag == 1){
	System.out.println("True");
	}else{
	System.out.println("False");
	}
}
}
