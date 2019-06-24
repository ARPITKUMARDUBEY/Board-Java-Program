import java.util.Scanner;

public class printnnumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUMBER = ");
        int times=sc.nextInt();
        for(int i=times;i>=0;i--)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(""+j);
            }
            System.out.print("\n");
        }
    }
}
