import java.util.Scanner;
public class reverseofthenumber {
        public static void main(String args[])
        {
            int original,data,reminder,checker=0;
            Scanner sc =new Scanner(System.in);
            System.out.print("PLEASE ENTER THE NUMBER = ");
            original=sc.nextInt();
            data=original;
            while(data>0)
            {
                reminder=data%10;
                checker=checker*10+reminder;
                data=data/10;
            }
            System.out.print(original+" AFTER REVERSING THE NUMBER "+checker);
        }
}
