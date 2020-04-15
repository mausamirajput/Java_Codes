import java.util.ArrayList;
import java.util.List;



interface MyFunctionalInterface {

    //A method with single parameter
    public int incrementByFive(int a);
}
interface MyFunctionalInterface1 {

    //A method with no parameter
    public String sayHello();
}

interface StringConcat {

    public String sconcat(String a, String b);
}


public class FirstProgram {

    public static void main(String args[]) {
        // lambda expression with single parameter num

        MyFunctionalInterface f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));

        MyFunctionalInterface1 msg = () -> {
            return "Hello";
        };
        System.out.println(msg.sayHello());

        // lambda expression with multiple arguments
        StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("Result: "+s.sconcat("Hello ", "World"));

        //iterating list through for loop
        List<String> list=new ArrayList<String>();
        list.add("Mausami");
        list.add("Amarsingh");
        list.add("Rajput");
        list.add("Software");
        list.add("Engineer");
        list.forEach(
                // lambda expression
                (names)->System.out.println(names)
        );

    }
}