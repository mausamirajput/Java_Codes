// converting the list of students to the stream and then we are applying the Java Stream filter to get the selected records from the stream, after that we are converting that stream to set using Collectors.toSet() method.

import java.util.stream.Collectors;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
class Student1{
    int id;
    String name;
    int age;
    public Student1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
public class Program1 {
    public static void main(String[] args) {
        List<Student1> studentlist = new ArrayList<Student1>();
        //Adding Students
        studentlist.add(new Student1(11,"Mausami",22));
        studentlist.add(new Student1(22,"Anuja",18));
        studentlist.add(new Student1(33,"Anushi",22));
        studentlist.add(new Student1(44,"Disha",23));
        studentlist.add(new Student1(55,"Tushar",18));
        //Fetching student data as a Set
        Set<Student1> students = studentlist.stream()
                .filter(n-> n.id>22)
                .collect(Collectors.toSet());
        //Iterating Set
        for(Student1 stu : students) {
            System.out.println(stu.id+" "+stu.name+" "+stu.age);
        }

        //Getting the average Age
        Double avgAge = studentlist.stream()
                .collect(Collectors.averagingInt(s->s.age));
        System.out.println("Average Age of Students is: "+avgAge);
    }
}