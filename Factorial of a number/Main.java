import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
     // int i=0;
    //  while(n>0) {
      int fact=1;
     for(int i=1;i<=n;i++)
      {
      fact=fact*i;
     }
      System.out.println(fact);
      
      
      
      
      
      
      
      
      
	}
}