import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i=0;
      for(i=1;i<=2*n;i++)
      {
      if(i%2!=0)
      {
      System.out.println(i);
      }
      }
	}
}