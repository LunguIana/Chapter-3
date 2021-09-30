package ex_13;
public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee( "John", "Smith", 5000.00 );
        Employee emp2 = new Employee( "Jane", "Doe", 8000.00 );

        System.out.printf( "Yearly salary of %s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary() );
        System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary() );

        System.out.println();

        System.out.println( "Giving 10% raise for each employee " );
        System.out.printf( "Yearly salary of %s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getRaiseSalary() );
        System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getRaiseSalary() );
    }
}