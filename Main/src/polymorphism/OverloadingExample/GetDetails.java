package polymorphism.OverloadingExample;

public class GetDetails {
    public static void main(String[] args) {
        Employee noone = new Employee();
        Employee emp = new FullTime();
        Employee emp2 = new PartTime();

        emp.calculateSalary();
        emp2.calculateSalary();
        noone.calculateSalary();
    }
}
