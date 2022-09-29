import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	int i,a=0,b=1,sum,z=2;
		        System.out.println("enter the limit");

	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	for(i=1;i<=limit;i++){
	    if(z%2==0){
	        	  System.out.println(a);

	    }
	    else{
	        	  System.out.println("-"+a);

	    }
	  sum=a+b;
	  a=b;
	  b=sum;
	  z++;
	}
	
	}
}
