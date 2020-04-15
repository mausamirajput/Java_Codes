import java.util.ArrayList;
import java.util.List;
import java.util.stream;
public class CountUsingStream{
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Mausami");
        names.add("Anuja");
        names.add("Anushi");
        names.add("Disha");

        //Using Stream and Lambda expression
        long count = names.stream().filter(str->str.length()<6).count(); // the stream() method returns a stream of all the names
        System.out.println("There are "+count+" strings with length less than 6");

    }
}