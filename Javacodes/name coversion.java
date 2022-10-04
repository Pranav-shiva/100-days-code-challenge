

public class Main
{
	public static void main(String[] args) {
		String s ="suraj kumar sing tiwari";
		char arr[] = new char[100];
		int i=0,j=1,k=1;
		
			 for(i=0;i<s.length();i++){
		    arr[i]= s.charAt(i);
		    if(arr[i]==' '){
		        j++;
		    }
		 }
		 if(j==1){
		      for(i=0;i<s.length();i++){
		          System.out.print(arr[i]);
		      }
		 }
		 
		 else{
		     i=0;
		     System.out.print(arr[i]);
		      for(i=0;i<s.length();i++){
		          if(arr[i]==' '&&k<j){
		              System.out.print("."+arr[i+1]);
		              i++;
		              k++;
		          }
		          else if(k==j){
		              System.out.print(arr[i]);
		          }
		      }
		 }
	}
}

