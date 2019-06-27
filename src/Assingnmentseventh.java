class varargument {
    static int sum(int ...n)
    {
        int data=0;
        for(int i:n)
        {
            data+=i;
        }
        System.out.print(""+data);
        return 0;
    }
    public static void main(String args[])
    {
         sum(1,2,3,4,5,6);
    }
}
