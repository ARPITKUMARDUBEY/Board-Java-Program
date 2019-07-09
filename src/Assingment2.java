import java.util.Scanner;
public class Assingment2 {
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         String name;
         name=sc.next();
         for(int i=0;i<name.length();i++)
         {
             if((name.charAt(i)>=65)&&(name.charAt(i)<=90))
             {
                 System.out.println("THIS '"+name.charAt(i)+"' IS UPPER CASE");
             }
             else if((name.charAt(i)>=97)&&(name.charAt(i)<=122))
             {
                 System.out.println("THIS '"+name.charAt(i)+"' IS LOWER CASE");
             }
         }
    }
}
