import java.util.*;

public class armstongnumber {
    public static void main(String args[])
    {
         int data2,data,reminder,checker=0;
         Scanner sc =new Scanner(System.in);
         System.out.print("PLEASE ENTER THE NUMBER = ");
         data=sc.nextInt();
         data2=data;
         while(data2>0)
         {
             reminder=data2%10;
             checker=checker+(int)(Math.pow(reminder,3));
             data2=data2/10;
         }
          if(checker==data)
          {
              System.out.print("IT IS ARMSTRONG");
          }
          else
          {
              System.out.print("IT IS NOT A ARMSTRONG");
          }
    }
}
