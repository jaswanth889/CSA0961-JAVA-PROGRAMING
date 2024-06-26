import java.util.*;
class king{
public static void main(String arg[]){
	Scanner s = new Scanner(System.in);
	int n,k=0,i;
	System.out.print("Enter the Number:");
	n = s.nextInt();
	for(i=1;i<=n;i++){
		if(n%i==0){
			k++;
		}
	}
	System.out.println("Number of Factors =" +k);
	}
}