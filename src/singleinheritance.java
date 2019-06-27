class parent
{
     int are;
     void area(int length,int breath)
     {
           this.are=length*breath;
     }
}

public class singleinheritance extends parent{
    public static void main(String args[])
    {
         singleinheritance sc = new singleinheritance();
         sc.area(5,2);
         int result=sc.are;
         System.out.print("THEA AREA IS = "+result);
    }
}
