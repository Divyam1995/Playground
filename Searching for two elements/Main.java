
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int arr_size=s.nextInt();
      int arr[]=new int[arr_size];
      for(int index=0;index<=arr_size-1;index++)
      {
       arr[index]=s.nextInt();
      }
      int serch_ele1=s.nextInt();
      int serch_ele2=s.nextInt();
      int ele_1_idx = -1;
      int ele_2_idx = -1;
      for(int index=0;index<=arr_size-1;index++)
      {
      if(serch_ele1== arr[index])

       {
       ele_1_idx=index;
         }
       if(serch_ele2== arr[index])
       {
        ele_2_idx=index;
       }
        }
       

System.out.println(ele_1_idx);
System.out.println(ele_2_idx);
    }
}