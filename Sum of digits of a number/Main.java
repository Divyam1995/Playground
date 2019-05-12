import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sum=0,temp,digit;
        temp=n;
      while(n>0)
      {
        digit=n%10;
        sum=sum+digit;
        n=n/10;
      }
    System.out.println(sum);
    
    }
}