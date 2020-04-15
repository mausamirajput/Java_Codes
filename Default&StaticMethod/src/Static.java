interface MyInterface1{
    /* This is a default method so we need not
     * to implement this method in the implementation
     * classes
     */
    default void newMethod(){
        System.out.println("Newly added default method");
    }

    /* This is a static method. Static method in interface is
     * similar to default method except that we cannot override
     * them in the implementation classes.
     * Similar to default methods, we need to implement these methods
     * in implementation classes so we can safely add them to the
     * existing interfaces.
     */
    static void anotherNewMethod(){
        System.out.println("Newly added static method");
    }
    /* Already existing public and abstract method
     * We must need to implement this method in
     * implementation classes.
     */
    void existingMethod(String str);
}
public class Static implements MyInterface1{
    // implementing abstract method
    public void existingMethod(String str){
        System.out.println("String is: "+str);
    }
    public static void main(String[] args) {
        Static obj = new Static();

        //calling the default method of interface
        obj.newMethod();
        //calling the static method of interface
        MyInterface1.anotherNewMethod();
        //calling the abstract method of interface
        obj.existingMethod("Hello from the practice session");


    }
}