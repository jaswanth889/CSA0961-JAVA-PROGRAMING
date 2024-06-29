import java.util.*; 
class GOAT { 
    public static int remove(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int i,j = 0;
        for(i=0;i<n-1;i++){
            if(a[i]!=a[i+1]){
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[n - 1];
        for(i=0;i<j;i++) {
            a[i] = temp[i];
        } 
        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 1, 1, 2, 2, 2 };
        int n = a.length,i;
        n = remove(a, n);
        for(i=0;i<n;i++)
            System.out.print(a[i] + " ");
    }
}