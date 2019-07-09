import java.util.Scanner;

public class searching {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int key,support;
        int data[]={1,4,6,7,8,9,10};
        System.out.print("ORIGINAL ARRAY DATA \n");
        for(int i=0;i<data.length;i++)
        {
            System.out.print(data[i]+"\t ");
        }
        System.out.print("\n");
        System.out.print("WHICH VALUE YOU WANT TO SEARCH = ");
        key=sc.nextInt();
        int size=data.length,flag=0,index=0;
        int mid=size/2;
        do {
            if (data[mid] > key)
            {
                mid--;
            }
            else if(data[mid]<key)
            {
                 mid++;
            }
            else
            {
                 flag=1;
                 index=mid;
                 break;
            }
        }
        while(size>mid);

        if(flag==1)
        {
             System.out.print("YOU KEY CONTENT PRESENT IN "+(index+1)+" PLACE !");
        }
        else
        {
            System.out.print("YOU KEY CONTENT NOT PRESENT IN THIS PLACE! ");
        }
    }
}