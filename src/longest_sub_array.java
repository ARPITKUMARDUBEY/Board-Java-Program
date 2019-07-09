import java.util.Scanner;
public class longest_sub_array {
    public static void sub_array(int data[],int size)
    {
        int original[]=new int[size];
        String da="",da2="";
        int flag=-1;
        int k=0;
        for(int i=0;i<size;i++)
        {
            original[i]=data[i];
        }
        da=da.concat(original[0]+" ");
        for(int i=0;i<size-1;i++)
        {
            if(original[i]<original[i+1])
            {
                da=da.concat(original[i+1]+" ");
                flag=1;
            }
            else
            {
                if(da.length()>da2.length())
                {
                     da2=da;
                }
                else
                {
                    da2=da2;
                }
                da="";
                da=da.concat(original[i+1]+" ");
                flag=0;
            }

        }
        if(flag==1)
            System.out.print("\n\n\n"+da);
        else if(flag==0)
            System.out.print("\n\n\n"+da2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("PLEASE ENTER THE SIZE OF THE ARRAY = ");
        size=sc.nextInt();
        int data[]=new int[size];
        System.out.println("PLEASE ENTER THE ARRAY = ");
        for(int i=0;i<size;i++)
        {
             data[i]=sc.nextInt();
        }
        System.out.println("YOUR DATA IS = \n");
        for(int i=0;i<size;i++)
        {
            System.out.print(data[i]+"\t");
        }
        longest_sub_array.sub_array(data,size);
    }
}