class grandfather
{
    int are;
    void area(int length,int breath)
    {
        this.are=length*breath;
    }
}
class father extends grandfather
{
    int peri;
    void perimeter(int length,int breath)
    {
        this.peri=2*(length+breath);
    }
}
public class multiple extends father{

        public static void main(String args[])
        {
            multiple sc = new multiple();
            sc.area(5,2);
            sc.perimeter(5,2);
            int result=sc.are;
            int result2=sc.peri;
            System.out.print("THEA AREA IS = "+result+"\n"+"THEA PERIMETER IS = "+result2);
        }
    }

