import java.util.*;
class king{
public static void main(String arg[]){
	int i,LCM,GCD=0,k,n,j,Multi=1;
	Scanner s = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
       	}
	k = a[0];
	for(i =0;i<n;i++)
	{
	if(k>a[i])
	k = a[i];
	}
	for(i=1;i<n;i++){
	for(j=2;j<k;j++){
	if(a[i]%j==0){
		GCD = j;
	}
	}
	}
	for(i=0;i<n;i++){
	Multi = Multi * a[i];
	}
	LCM = Multi/GCD;
	System.out.println("GCD is "+GCD);
	System.out.println("LCM is "+LCM);
}
}
			
