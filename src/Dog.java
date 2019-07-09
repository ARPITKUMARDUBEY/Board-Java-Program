class Dog
{
    String name,breed;
    int age;

    void eat()
    {
        System.out.println("THE DOF IS EATING!");
    }

    public static void main(String args[])
    {

        Dog dog1=new Dog ();
        dog1.name="TIGER";
        dog1.age=20;
        dog1.breed="chowchow";

        Dog dog2=new Dog ();
        dog2.name="TOMY";
        dog2.age=40;
        dog2.breed="BULLDOG";

        Dog dog3=new Dog ();
        dog3.name="SHERU";
        dog3.age=10;
        dog3.breed="POODLE";

        System.out.println("DOG        --->  1");
        System.out.println("DOG NAME   ----> "+dog1.name);
        System.out.println("DOG AGE    ----> "+dog1.age);
        System.out.println("DOG BREED  ----> "+dog1.breed);
        System.out.println("DOG ----> 1 --->\n\n\n\n ");
        dog1.eat();

        System.out.println("DOG       --->  2");
        System.out.println("DOG NAME  ----> "+dog2.name);
        System.out.println("DOG AGE   ----> "+dog2.age);
        System.out.println("DOG BREED ----> "+dog2.breed);
        System.out.println("DOG ----> 2 --->\n\n\n\n ");
        dog2.eat();

        System.out.println("DOG       --->  3");
        System.out.println("DOG NAME  ----> "+dog3.name);
        System.out.println("DOG AGE   ----> "+dog3.age);
        System.out.println("DOG BREED ----> "+dog3.breed);
        System.out.println("DOG ----> 3 ---> ");
        dog3.eat();

    }
}
