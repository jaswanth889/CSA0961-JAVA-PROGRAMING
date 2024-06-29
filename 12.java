import java.util.*;
class Parent{
	int i,j,k;
	int n =20;
	void even(int n){
		System.out.print("Even:");
		for(i=0;i<n;i++){
		if(i%2==0){
		System.out.println(i);
		}}}
	void odd(int n){
		System.out.print("Odd:");
		for(i=0;i<n;i++){
		if(i%2==1){
		System.out.println(i);
		}}}
	void prime(int n){
	for(i=1;i<=n;i++){
	   if (i > 1){
       for(j=2;j<i;j++){
           if ((i%j) == 0){
               break;
		}
       else{
		System.out.print(i);

		}
	}
	}
}
}
}
class child extends Parent{
		int a = 30;
	void even(int a){
		super.even(n);
		System.out.print("Even:");
		for(i=0;i<a;i++){
		if(i%2==0){
		System.out.println(i);
		}}}
	void odd(int a){
		super.odd(n);
		System.out.print("Odd:");
		for(i=0;i<a;i++){
		if(i%2==1){
		System.out.println(i);
		}}}
	void prime(int a){
		super.prime(n);
		System.out.print("Prime:");
		for(i=1;i<=a;i++){
	 	  	if (i > 1){
       		for(j=2;j<i;j++){
           	if ((i%j) == 0){
               	break;
			}
       		else{
		System.out.print(i);
		}
	}
	}
	}
}
public static void main(String arg[]){
	child m = new child();
	m.even();
	m.odd();
	m.prime();
	m.even();
	m.odd();
	m.prime();
	}
}
