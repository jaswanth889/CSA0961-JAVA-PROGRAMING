import java.util.*;
import java.lang.Math;
class king{
	public static void main(String arg[]){
	 Scanner s = new Scanner(System.in);
	int m,n,i,j,sum=0,rem,k=0,a;
	int arr[] = new int[100];
	System.out.print("Enter the lower range:");
	m = s.nextInt();
	System.out.print("Enter the upper range:");
	n = s.nextInt();
	for(i=m;i<=n;i++){
		for(j=1;j<=i;j++){
		if(i == Math.pow(j,2)){
				arr[k]=i;
				k++;
			}
		}	
		}
for(i=0;i<k;i++){
	a=arr[i];
	while(a!=0){
	rem = a%10;
	sum = sum + rem;
	a = a/10;
	}
	if(sum<10){
	System.out.println(arr[i]);
	}
	sum=0;
	}
	}

}