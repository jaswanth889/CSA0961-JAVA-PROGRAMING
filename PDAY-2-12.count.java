import java.util.*; 
class king{
static boolean iscom(int n)
{
	if (n == 1 || n == 0)
		return false;
	for (int i = 2; i < n; i++) {
		if (n % i == 0)
			return true;
	}
	return false;
}
    public static void main(String args[])
    {
	int A,B,k=0,l=0,n;
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
	for (int i = 0; i < n; i++){
	if (iscom(a[i])){
	k++;
	}
	else{
	l++;
	}
	}
	System.out.println("Composite Number:"+k);
	System.out.println("Prime Number:"+l);
}
}
