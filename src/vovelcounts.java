import java.util.Scanner;

public class vovelcounts {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the name or letters = ");
        String letters=sc.next();
        int vowels=0;
        for(int i=0;i<letters.length();i++)
        {
            if((letters.charAt(i)=='a')||(letters.charAt(i)=='A')||(letters.charAt(i)=='e')||(letters.charAt(i)=='E')||(letters.charAt(i)=='i')||(letters.charAt(i)=='I')||(letters.charAt(i)=='o')||(letters.charAt(i)=='O')||(letters.charAt(i)=='u')||(letters.charAt(i)=='U'))
            {
                vowels+=1;
            }
            else
            {
                 vowels+=0;
            }
        }
        System.out.println("Total vowels in this letters = "+vowels);
        System.out.println("Total consonants in this letters = "+(letters.length()-vowels));
        System.out.println("Total letters = "+(letters.length()));
    }
}
