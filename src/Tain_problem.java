class Train__problem {
    static int common_count=0;
    static int i=0;
    static int count_A=0,count_B=0;
   static String []stations={"chennai","mumbai","indore","delhi","bhopal","gandhinagar","patiala","ludhiana","chandigarh","jalandhar"};
    public static void Print() throws Exception{
        TrainA2 ta = new TrainA2();
        TrainB2 tb = new TrainB2();
        if (i % 2 == 0)
        {
             Thread.sleep(5000);
             ta.start();
        }
        else
        {
            Thread.sleep(5000);
            tb.start();
        }
        ta.join();
        tb.join();
    }
    static void TotalTraverserstation()
    {
        count_A=count_A+1;
        count_B=count_B+1;
        System.out.print("\nTrain A stoppage traversed station = "+count_A);
        System.out.print("\nTrain B stoppage traversed station = "+count_B);
    }
   public static void main(String[] args) throws Exception{
       for (i=0;i<stations.length;i++)
       {
           Print();
       }
       TotalTraverserstation();
    }
}
class TrainA2 extends Thread
{
    @Override
    public void run() {
        Train__problem tp=new Train__problem();
        try {
            System.out.print("cuuent train A reached at --->  " + tp.stations[tp.common_count] + "\n");
            tp.count_A =  tp.common_count;
            tp.common_count++;
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
    }
}
class TrainB2 extends Thread
{
    @Override
    public void run() {

           Train__problem tp = new Train__problem();
        try {

           System.out.print("cuuent train B reached at --->  " + tp.stations[tp.common_count] + "\n");
           tp.count_B = tp.common_count;
           tp.common_count++;
       }
       catch (Exception e)
       {
           System.out.print(e);
       }
    }
}