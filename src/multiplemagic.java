class grandfather2
{
    int are;
    grandfather2()
    {
        System.out.print("WELCOME 1991 YEAR!\n");
    }
    void perimeter(int length,int breath)
    {
        this.are=length*breath;
    }
}
class father2 extends grandfather2
{
    int peri;
    void perimeter(int length,int breath)
    {
        this.peri=2*(length+breath);
    }
}
 class multiplemagic extends father2{
    public static void main(String args[])
    {
        multiplemagic sc = new multiplemagic();
        sc.perimeter(5,2);
        int result=sc.are;
        int result2=sc.peri;
        System.out.print("THEA AREA IS = "+result+"\n"+"THEA PERIMETER IS = "+result2);
    }
}
