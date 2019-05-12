import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
     // int i=0;
     // while(n>0)
      
     for(int i=1;i<=n;i++)
      {
      if(n%i==0)
      {
      System.out.println(i);
      }
      }
      
      
      
      
      
      
      
	}
}