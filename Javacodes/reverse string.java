
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Reverse rev=new Reverse();
		rev.reverse();
	}
}
class Reverse{
    void reverse(){
        int i;
        
        String s;
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the String");
                ////string input
            s=sc.nextLine();

        char a[]=new char[s.length()];
        //converting string into char array
        for(i=0;i<s.length();i++){
            a[i]=s.charAt(i);
        }
       ////printing array
       System.out. println("reversed string is:");
        for(i=s.length()-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}
