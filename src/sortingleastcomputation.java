import java.util.Scanner;
public class sortingleastcomputation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int key,support;
        int data[]={1,1,1,1,0,0,1,0};
        System.out.print("ORIGINAL ARRAY DATA \n");
        for(int i=0;i<data.length;i++)
        {
            System.out.print(data[i]+"\t ");
        }
        System.out.print("\n");

        for(int i=1;i<data.length;i++)
        {
              key=data[i];
              support=i-1;
              while((support>=0)&&(data[support]>key))
              {
                   data[support+1]=data[support];
                   support=support-1;
              }
              data[support+1]=key;
        }
        for(int i=0;i<data.length;i++)
        {
             System.out.print(data[i]+"\t ");
        }
    }
}