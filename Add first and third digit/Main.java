import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int n1,n2,n3;
      n1=n/100;
      n2=n%10;
      n3=n1+n2;
      System.out.println(n3);
    }
}