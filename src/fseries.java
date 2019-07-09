import java.util.Scanner;

public class fseries {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUMBER OF TIME YOU WANT TO PRINT THE SERIES = ");
        int number=sc.nextInt();
        int first=0,second=1,third;
        if(number==0)
        {
            System.out.print("PLEASE ENTER THE NUMBER GREATER THAN ZERO");
        }
        else if(number==1)
        {
            System.out.print(first+"\t ");
        }
        else
        {
            System.out.print(first+"\t ");
            System.out.print(second+"\t ");
            while(number-2>0)
            {
                third=first+second;
                first=second;
                second=third;
                System.out.print(third+"\t ");

                number--;
            }
        }
    }
}
