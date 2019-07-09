import java.util.Random;

public class randomnumbergenerate {
    public static void main(String args[])
    {
        Random rand = new Random();
        int data = rand.nextInt(100);
        System.out.print("THE RANDOM NUMBER FROM 1 TO 100 = "+data);
    }
}
