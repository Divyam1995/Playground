import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int rev=0;
    while(n!=0)
    {
      rev=rev*10;
      rev=rev+n%10;
      n=n/10;
    }
    System.out.println(rev);
  }
}