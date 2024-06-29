import java.util.*;
class GOAT
{
    public static void main(String args[]) 
    {
        int n, temp = 0, i, j, m, a, sum, difference;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
	System.out.println("Enter the value of M:");
	m = s.nextInt();
	for(i=0;i<n;i++)   
	{  
	for(j=i+1;j<n;j++)   
	{    
	if (arr[i] > arr[j])   
	{  
	temp = arr[i];  
	arr[i] = arr[j];  
	arr[j] = temp;  
	}  
	}   
	}  
        System.out.println(m+"th Maximum Number = "+arr[n-m]);

    }
}
