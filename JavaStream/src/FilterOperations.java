import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOperations {

    public static void main(String[] args) {
        //filter with multiple conditions
        List<String> names = Arrays.asList("Mausami","Anuja","Anushi","Disha","Amarsingh");

        List<String> longnames = names.stream()
                .filter(str -> str.length() > 6 && str.length() < 8) //Multiple conditions
                .collect(Collectors.toList());

        longnames.forEach(System.out::println);

        //filter and map
        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squares = num.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);

    }

}