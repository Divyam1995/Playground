import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner si=new Scanner(System.in);
     int n=si.nextInt();
     int r,rem=0,Last_digit,Second_digit;
      while(n>0)
        {
        r=n%10;
        rem=rem*10+r;
        n=n/10;
      }
      Last_digit=rem%100;
      Second_digit=Last_digit/10;
      System.out.println(Second_digit);
    }
}
