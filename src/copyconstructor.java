class copy_constructor {
    int data,data2;
    copy_constructor(int data,int data2)
    {
        this.data=data;
        this.data2=data2;
        System.out.print("data --> "+this.data+"\ndata2 --> "+this.data2+"\n");
    }
    copy_constructor(copy_constructor da)
    {

        this.data=da.data+5;
        this.data2=da.data2+5;
        System.out.print("data --> "+this.data+"\ndata2 --> "+this.data2+"\n");
    }


    public static void main(String args[])
    {
        copy_constructor c= new copy_constructor(5,2);
        copy_constructor c2= new copy_constructor(c);
    }
}
