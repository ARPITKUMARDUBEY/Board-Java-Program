import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class Train_problem {
    static int counterA=0,counterB=0;
    public static void main(String[] args)throws Exception {
        Scanner sc= new Scanner(System.in);
        float timeA,timeB ;
        System.out.print("Please Enter The Journey Timeing Of Train A = \n");
        timeA=sc.nextFloat();
        System.out.print("Please Enter The Journey Timeing Of Train B = \n");
        timeB=sc.nextFloat();
        String station_List[]={"chennai","mumbai","indore","delhi","bhopal","gandhinagar","patiala","ludhiana","chandigarh","jalandhar"};
        int number_of_station=station_List.length;
        Train_problem tt = new Train_problem();
        Thread tA=new TrainA();
        Thread tB=new TrainB();
        for(int i=0;i<number_of_station;i++)
        {
            if(i%2==0)
            {
                  tB.run();
            }
            else
            {
                tA.run();
            }
        }
        tA.join();
        tB.join();
        System.out.print("\nTrain A Detail's ------>");
        System.out.print("\nTrain A Stoppage = "+tt.counterA+"\n Total Time Taken = "+(tt.counterA*5000)+" milliseconds");
        float destination_timeA=tt.counterA*5000;
        destination_timeA=destination_timeA/3600;
        destination_timeA=timeA+destination_timeA;
        System.out.print("\nDestination Time of Train A = "+destination_timeA+"HRS");


        System.out.print("\n\nTrain B Detail's ------>");
        System.out.print("\nTrain B Stoppage = "+tt.counterB+"\n Total Time Taken = "+(tt.counterB*5000)+" milliseconds");
        float destination_timeB=tt.counterB*5000;
        destination_timeB=destination_timeB/3600;
        destination_timeB=timeB+destination_timeB;
        System.out.print("\nDestination Time of Train B = "+destination_timeB+"HRS");
    }
}
class TrainA extends Thread
{
    public void run()
    {
        Train_problem tp=new Train_problem();
        tp.counterA++;
    }
}
class TrainB extends Thread
{
    public void run()
    {
        Train_problem tp=new Train_problem();
        tp.counterB++;
    }
}