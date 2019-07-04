import java.util.Scanner;

public class string_count {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count=0,k=0,flag=0,counter=0;
        System.out.print("PLEASE ENTER THE DATA  =  ");
        String data= sc.next();
        for(int i=0;i<data.length();i++)
        {
             count=0;
             for(int j=0;j<data.length();j++)
             {
                  if(data.charAt(i)==data.charAt(j))
                  {
                      count++;
                  }
             }
            for(int j=i+1;j<data.length();j++)
            {
                if(data.charAt(i)==data.charAt(j))
                {
                     flag=0;
                     break;
                }
                else
                {
                     flag=1;

                }
            }
            if(flag==1)
            {
                System.out.print(data.charAt(i)+"---->"+count+"\n");
                counter++;
            }
        }
        System.out.println("total unique character are = "+counter);
    }

}
