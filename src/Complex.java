import java.util.Scanner;
class Complex {
        float ral,img;
        Complex()
        {
            System.out.print("WELCOME TO COMPLEX  NUMBER \n");
        }
        Complex(float realdata,float imaginarydata)
        {
            this.ral=realdata;
            this.img=imaginarydata;
        }
        void display()
        {
              System.out.print("THE NUMBER IS NOW = "+this.ral+"+"+this.img+"i");
        }
        public static void main(String args[])
        {
            float rea,img;
            Scanner sc = new Scanner(System.in);
            System.out.print("PLEASE ENTER THE REAL NUMBER HERE = ");
            rea=sc.nextFloat();
            System.out.print("PLEASE ENTER THE IMAGINARY NUMBER HERE = ");
            img=sc.nextFloat();
            Complex c = new Complex(rea,img);
            c.display();
        }
}