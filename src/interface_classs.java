interface data
{
     void collection();
}
class A implements data
{
    public void collection()
    {
          System.out.print("Ineterface data");
    }

    public static void main(String[] args) {
       data a;
       a=new A();
       a.collection();

    }
}
