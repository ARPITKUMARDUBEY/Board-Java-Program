import java.util.Scanner;
public class prime {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUMBER = ");
        int data = sc.nextInt();
        int flag=0;
        if(data==0)
        {
            System.out.print("NOT A PRIME NUMBER");
        }
        else if(data==1)
        {
            System.out.print("IT's A CO-PRIME NUMBER");
        }
        else
        {
            for(int i=2;i<data/2;i++)
            {
                if(data%i==0)
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                }
            }
        }
        if(flag==0)
        {
            System.out.print("IT's A PRIME NUMBER");
        }
        else
        {
            System.out.print("IT's NOT A PRIME NUMBER");
        }
    }
}
