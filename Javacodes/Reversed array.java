import java.util.*;
public class Main
{
	public static void main(String[] args) {
Reverse r=new Reverse();
r.reverse();
	}
}
class Reverse{
    void reverse(){
     int i,j,n ,temp;
     int a[]=new int[100];
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of element you want to enter in array");
     ///number of element you want to insert in array
     n=sc.nextInt();
     System.out.println("enter the element of array");
     for(i=0;i<n;i++){
         //inserting the element in array
         a[i]=sc.nextInt();
     }
     //////reversing the array
     for(i=0,j=n-1;i<j;i++,j--){
         
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
         
     }
     System.out.prinln("Revrsed array is ");
     /////printing Revrsed array
     for(i=0;i<n;i++){
       System.out.println(a[i]); 
     }
    }
     
}
