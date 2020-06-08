import java.util.*;

public class Main{
	public static int factorial(int n){
		if (n == 0)
			return 1;   
		else
			return(n * factorial(n-1)); //recursively calling factorial function
	}
	
	public static void fibbonaci(int n){
		if(n>0)
		{
			c=a+b; //next term in series
			a=b;
			b=c;
			System.out.print(" "+c);   
			fibbonaci(n-1); //recursively calling fibbonaci function
		}
	}
	
	static int a=0,b=1,c;
	public static void main(String[] args){
	   int list_num,fact;
	       List<Integer> num=Arrays.asList(1,3,5,7,9); //arraylist with 1,3,5,7,9
	       for(Integer i:num) //for-each loop
	       {   
	       a=0;
	       b=1;
	       list_num=i.intValue();
	       System.out.println("Fibbonaci series for "+list_num);
	       System.out.print(a+" "+b);
	       fibbonaci(list_num-2); //calling fibbonaci for values in list
	       fact=factorial(list_num); //calling factorial for values in list
	       System.out.println();
	       System.out.println("Factorial for "+list_num+" is "+fact);
	       System.out.println();
	       }
	}
}