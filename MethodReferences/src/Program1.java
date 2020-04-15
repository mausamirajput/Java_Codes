import java.util.function.BiFunction;
//The BiFunction Interface is a part of the java. util. function package which has been introduced since Java 8, to implement functional programming in Java. It represents a function which takes in two arguments and produces a result.
import java.util.Arrays;

interface MyInterface{
    void display();
}

class Multiplication{
    public static int multiply(int a, int b){
        return a*b;
    }
}


interface MyInterface1{
    Hello display(String say);
}
class Hello{
    public Hello(String say){
        System.out.print(say);
    }
}



public class Program1 {
    public void myMethod(){
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {
        Program1 obj = new Program1();
        // Method reference using the object of the class
        MyInterface ref = obj::myMethod;
        // Calling the method of functional interface
        ref.display();


        BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
        int pr = product.apply(11, 5);
        System.out.println("Product of given number is: "+pr);


        String[] stringArray = { "Mausami", "Anuja", "Sakshi", "Bhumika", "Seema", "Anagha", "Priya"};
        /* Method reference to an instance method of an arbitrary
         * object of a particular type
         */
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for(String str: stringArray){
            System.out.println(str);
        }

        MyInterface1 ref1 = Hello::new;
        ref1.display("Hello World!");
    }
}