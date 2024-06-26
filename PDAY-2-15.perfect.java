import java.util.*;
class king
{
public static void main(String arg[])
{
	Scanner s = new Scanner(System.in);
	int i=1, b=0, k;
	System.out.print("Enter the Range:");
	k = s.nextInt();
	while(k!=b){
		if(isper(i)==1){
		System.out.println(i);
		b = b+1;
		}
		i++;
	}
}
public static int isper(int a){
	int j, sum=0;
	for(j=1;j<a;j++){
		if(a%j==0){
		sum = sum + j;
		}
		}
	if(sum==a){
	return 1;
	}
	else{
	return 0;
	}
}
}	