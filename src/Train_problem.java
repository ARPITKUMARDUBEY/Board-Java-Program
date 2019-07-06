import com.sun.jdi.event.ExceptionEvent;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class Train_problem {
    static int counterA=0,counterB=0,counter=0;
    static String station_List[]={"chennai","mumbai","indore","delhi","bhopal","gandhinagar","patiala","ludhiana","chandigarh","jalandhar"};
    public static void main(String[] args)throws Exception {
        Scanner sc= new Scanner(System.in);
        int number_of_station=station_List.length;
        Train_problem tt = new Train_problem();
        Thread tA=new TrainA();
        Thread tB=new TrainB();
        int i=0;
        Thread.sleep(5000);
        tB.start();
        i++;
        Thread.sleep(5000);
        tA.start();
        for(i=2;i<number_of_station;i++)
        {
            if(i%2==0)
            {
                Thread.sleep(5000);
                tB.run();
            }
            else
            {
                Thread.sleep(5000);
                tA.run();
            }
        }
        tA.join();
        tB.join();

        System.out.print("\n\n\nTrain A Detail's ------>");
        System.out.print("\nTrain A Stoppage = "+tt.counterA+"\n");

        System.out.print("\n\nTrain B Detail's ------>");
        System.out.print("\nTrain B Stoppage = "+tt.counterB+"\n ");

    }
}
class TrainA extends Thread
        {
    public void run()
    {
        Train_problem tp=new Train_problem();
        System.out.print("\nThe train ---.>  A reached at --> "+tp.station_List[tp.counter]+" station ");
        tp.counter++;
        tp.counterA=tp.counter;
    }
}
class TrainB extends Thread
{
    public void run()
    {
        Train_problem tp=new Train_problem();
        System.out.print("\nThe train ---.>  B reached at --> "+tp.station_List[tp.counter]+" station ");
        tp.counter++;
        tp.counterB=tp.counter;
    }
}