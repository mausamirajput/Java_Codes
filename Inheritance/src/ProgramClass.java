interface Car
{
    public default void drive()
    {
        System.out.println("Car is driving");
    }
}
interface Jeep
{
    public default void drive()
    {
        System.out.println("Jeep is driving");
    }
}
public class ProgramClass implements Car,Jeep
{
    @Override //In Java 8 you cannot implement multiple interfaces having same signature, without explicitly overriding the methods in the child class.
    public void drive()
    {
        System.out.println("Vehicle is driving");
    }
    public static void main(String args[])
    {
        ProgramClass v = new ProgramClass();
        v.drive();
    }
}