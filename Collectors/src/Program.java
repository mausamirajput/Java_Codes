

import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
class Student{
    int id;
    String name;
    int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
public class Program {
    public static void main(String[] args) {
        List<Student> studentlist = new ArrayList<Student>();
        //Adding Students
        studentlist.add(new Student(11,"mausami",22));
        studentlist.add(new Student(22,"anuja",18));
        studentlist.add(new Student(33,"tushar",22));
        studentlist.add(new Student(44,"anushi",23));
        studentlist.add(new Student(55,"disha",18));
        //Fetching student names as List
        List<String> names = studentlist.stream()
                .map(n->n.name)
                .collect(Collectors.toList());
        System.out.println(names);
    }
}