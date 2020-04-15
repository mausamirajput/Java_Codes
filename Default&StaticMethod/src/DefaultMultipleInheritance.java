interface MyInterface2{

    default void newMethod(){
        System.out.println("Newly added default method");
    }
    void existingMethod(String str);
}
interface MyInterface3{

    default void newMethod(){
        System.out.println("Newly added default method");
    }
    void disp(String str);
}
public class DefaultMultipleInheritance implements MyInterface2, MyInterface3{
    // implementing abstract methods
    public void existingMethod(String str){
        System.out.println("String is: "+str);
    }
    public void disp(String str){
        System.out.println("String is: "+str);
    }
    //Implementation of duplicate default method
    public void newMethod(){
        System.out.println("Implementation of default method");
    }
    public static void main(String[] args) {
        DefaultMultipleInheritance obj = new DefaultMultipleInheritance();

        //calling the default method of interface
        obj.newMethod();


    }
}