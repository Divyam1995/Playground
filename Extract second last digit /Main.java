import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i=0,val,r=0;
      val=n;
      while(i<2)
      {
        r=n%10;
        n=n/10;
        i++;
      }
      System.out.println(r);
	}
}