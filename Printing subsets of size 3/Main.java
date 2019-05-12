import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner s=new Scanner(System.in);
       int arr_size=s.nextInt();
      int arr[]=new int [arr_size];
     
      for(int index=0; index<=(arr_size-1); index++)
      {
      arr[index]=s.nextInt();
      }
      Subsets_of_size_3(arr_size,arr);
    }
  
  public static void Subsets_of_size_3(int arr_size, int arr[])
  {
  for(int index_1=0;index_1<=(arr_size-2); index_1++)
  {
  for(int index_2=index_1+1; index_2<=(arr_size-1); index_2++)
  {
   for(int index_3=index_2+1; index_3<=(arr_size-1); index_3++)
   {   
  System.out.print("("+arr[index_1]+", " +arr[index_2]+", " +arr[index_3]+")"+" ");
  }
  //  System.out.print("\n");
  }
   System.out.print("\n");
  }
  // System.out.print("\n");
  }
  
  
  
  
  
  
  
  
  
  
  
}
