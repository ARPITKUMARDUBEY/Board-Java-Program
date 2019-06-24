import java.util.Scanner;

public class Triangle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE SIDE OF TRIANGLE = ");
        System.out.print("PLEASE ENTER THE SIDE 1 = ");
        double side1=sc.nextDouble();
        System.out.print("PLEASE ENTER THE SIDE 2 = ");
        double side2=sc.nextDouble();
        System.out.print("PLEASE ENTER THE SIDE 3 = ");
        double side3=sc.nextDouble();
        if((side1>side2)&&(side1>side3))
        {

            if(side1<(side2+side3))
            {
                System.out.print("IT IS  A TRIANGLE ");
            }
            else
            {
                System.out.print("IT IS NOT A TRIANGLE ");
            }
        }
        else if((side2>side1)&&(side2>side3))
        {
            if(side2<(side1+side3))
            {
                System.out.print("IT IS A TRIANGLE ");
            }
            else
            {
                System.out.print("IT IS NOT A TRIANGLE ");
            }
        }
        else if((side3>side1)&&(side3>side2))
        {
            if(side3<(side1+side2))
            {
                System.out.print("IT IS  A TRIANGLE ");
            }
            else
            {
                System.out.print("IT IS NOT A TRIANGLE ");
            }
        }
    }
}
