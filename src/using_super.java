class grandfather3
{
    int are;
    grandfather3()
    {
        System.out.print("WELCOME 1991 YEAR!\n");
    }
    void area(int length,int breath)
    {
        this.are=length*breath;
    }
}
class father3 extends grandfather3
{
    int peri;
    void perimeter(int length,int breath)
    {

        super.area(5,2);
        this.peri=2*(length+breath);
    }
}

public class using_super extends father3 {
    public static void main(String args[])
    {
        using_super sc = new using_super();
        sc.perimeter(5,2);
        int result=sc.are;
        int result2=sc.peri;
        System.out.print("THEA AREA IS = "+result+"\n"+"THEA PERIMETER IS = "+result2);
    }

}
