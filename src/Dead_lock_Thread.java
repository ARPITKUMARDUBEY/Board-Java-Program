public class Dead_lock_Thread {
    public static void main(String[] args) {
        try
        {
            System.out.print("ENTERING INto dead lock");
            Thread.currentThread().join();
            System.out.print("AFTER dead Lock ");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
