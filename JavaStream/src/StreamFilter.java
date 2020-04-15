import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamFilter {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("mausami","Sansa","Jon","amarsingh","rrajputt");

        //Creating the stream of all names
        Stream<String> allNames = names.stream();

        //Creating another stream by filtering long names using filter()
        Stream<String> longNames = allNames.filter(str -> str.length() > 6);

        //displaying the long names
        longNames.forEach(str->System.out.print(str+" "));
    }
}