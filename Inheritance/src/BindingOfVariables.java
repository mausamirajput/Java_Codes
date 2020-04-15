class Employee1 {
    String name = "Employee";
    void printName() {
        System.out.println(name);
    }
}
class Programmer extends Employee1 {
    String name = "Programmer";
    void printName() {
        System.out.println(name);
    } }
public class BindingOfVariables {
    public static void main(String[] args) {
        Employee1 emp = new Employee1(); //Reference variable of type Employee, object of type Employee
        Employee1 programmer = new Programmer(); //Reference variable of type Employee, object of type Programmer
        System.out.println(emp.name); // Accesses variable name defined in class Employee

        System.out.println(programmer.name); //ariables are bound at compile time. Because type of variable programmer is Employee, this accesses the variable name defined in class Employee.
        emp.printName(); //Accesses method in class Employee
        programmer.printName();  //Methods are bound at runtime; which method executes depends on the type of object on which it’s called. This code calls method printName in class Programmer.
    }
}