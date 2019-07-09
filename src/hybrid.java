class dada_ji
{
     int n=5;
}
class papa_ji extends dada_ji
{
    int m=10+this.n;
    void data()
    {
        System.out.print("\n"+this.m+"\n");
        System.out.print("\nWELCOME TO PAPA WORLD ");
    }
}
class beta_ji extends dada_ji
{
    int m=15+this.n;
    void data()
    {
        System.out.print("\n"+this.m+"\n");
        System.out.print("\nWELCOME TO BETA WORLD ");
    }
}

public class hybrid {
    public static void main(String args[])
    {
        beta_ji sc = new beta_ji();
        sc.data();
        papa_ji p = new papa_ji();
        p.data();
    }
}

