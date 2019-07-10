abstract class bank
{
     void S_I(int p,int t)
     {
          int c=p*2*t/100;
          System.out.print("Bank intrest = "+c);
     }
}
class sbi extends bank
{
    void S_I(int p,int t)
    {
        int c=p*5*t/100;
        System.out.print("sbi intrest = "+c);
    }
}
class boi extends bank
{
    void S_I(int p,int t)
    {
        int c=p*10*t/100;
        System.out.print("boi intrest = "+c);
    }
}
class pnb extends bank
{
    void S_I(int p,int t)
    {
        int c=p*20*t/100;
        System.out.print("pnb intrest = "+c);
    }
}
class apna extends bank
{
    void welcome()
    {
        System.out.print("Welcome to hamara bank");
    }
}

public class abstract_class {
    public static void main(String args[])
    {
        boi b= new boi();
        b.S_I(1000,1);
        sbi s= new sbi();
        s.S_I(1000,1);
        pnb p= new pnb();
        p.S_I(1000,1);
        apna a=new apna();
        a.welcome();
        a.S_I(1000,1);
    }
}