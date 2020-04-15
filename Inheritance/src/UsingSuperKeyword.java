interface Car1
{
    public default void drive1()
    {
        System.out.println("Car is driving");
    }
}
interface Jeep1
{
    public default void drive1()
    {
        System.out.println("Jeep is driving");
    }
}
public class UsingSuperKeyword implements Car1,Jeep1
{
    @Override
    public void drive1()
    {
        Car1.super.drive1();  //It is also possible to call the Parent interface method explicitly from the Child class. Lets take the above scenario if we want to call the Car interface drive() method, we can do that with the help of Super Keyword.
    }
    public static void main(String args[])
    {
        UsingSuperKeyword v = new UsingSuperKeyword();
        v.drive1();
    }
}