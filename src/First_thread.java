public class First_thread {
    public static void main(String[] args) {
         Train_A  ta = new Train_A();
         ta.start();
         System.out.print("Set priority = "+ta.getPriority());
         System.out.print("Thread id no =  "+ta.getId()+"\n");
        System.out.print("Thread  class =  "+ta.getClass()+"\n");
        System.out.print("Thread name   =   "+ta.getName()+"\n");
        System.out.print("Thread state  =  "+ta.getState()+"\n");
        System.out.print("Thread is alive or dead  =  "+ta.isDaemon()+"\n");

    }
}
class Train_A extends Thread
{
    @Override
    public void run()
    {
         System.out.println("Hello This Thread A\n");
    }
}