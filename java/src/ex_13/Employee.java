package ex_13;
public class Employee
{
    private final String firstName;
    private final String lastName;
    private final double monthlySalary;

    public Employee (String fname, String lname, double msalary)
    {
        firstName = fname;
        lastName = lname;

        monthlySalary = Math.max(msalary, 0.0);
    }
    public String getFirstName ()
    {
        return firstName;
    }
    public String getLastName () {
        return lastName;
    }
    public double getYearlySalary()
    {
        return monthlySalary * 12;
    }
    public double getRaiseSalary()
    {
        double raise =  monthlySalary * 0.1 ;
        return ( monthlySalary + raise ) * 12;
    }
}