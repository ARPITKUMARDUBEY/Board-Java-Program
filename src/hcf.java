import java.util.Scanner;
public class hcf {
    public static void main(String args[])
    {
        int f1,f2,copy_f1,copy_f2,temp,hcf,lcm=0,i=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUMBER = ");
        f1=sc.nextInt();
        System.out.print("\nPLEASE ENTER THE NUMBER = ");
        f2=sc.nextInt();
        copy_f1=f1;
        copy_f2=f2;
        if((f1>0)&&(f2>0))
        {
            if(f1>f2)
            {
                i=f1;
                while(i>=2)
                {
                    if((f1%i==0)&&(f2%i==0))
                    {
                         lcm=(f1/i)*f2;
                         break;
                    }
                    else
                    {
                        lcm=f1*f2;
                    }
                    i--;
                }
            }
            else if(f2>f1)
            {
                i=f2;
                while(i>=1)
                {
                    if((f2%i==0)&&(f1%i==0))
                    {
                        lcm=(f2/i)*f1;
                        break;
                    }
                    else
                    {
                        lcm=f1*f2;
                    }
                    i--;
                }

            }
            else
            {
                lcm=f1;
            }
        }
        else
        {
            lcm=0;
        }
        hcf=(f1*f2)/lcm;
        System.out.println("THE HCF OF "+copy_f1+" and "+copy_f2+" = "+hcf);

        System.out.println("THE LCM OF "+copy_f1+" and "+copy_f2+" = "+lcm);
    }
}