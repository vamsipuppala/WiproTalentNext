package inheritance;

public class TestEmployee
{
    public static void main(String[] args)
    {
        Employee emp=new Employee("hari",400000.00,2008,"E1008");
        System.out.println("Employee name:"+emp.getName()+" Employee Annual Salary"+emp.getAnnualSalary()+" Insurance Number"+emp.getInsNum()+" Year of joining"+emp.getYear());
        emp.setAnnualSalary(500000.00);
        emp.setInsNum("E1009");
        System.out.println("Employee name:"+emp.getName()+" Employee Annual Salary"+emp.getAnnualSalary()+" Insurance Number"+emp.getInsNum()+" Year of joining"+emp.getYear());
    }
}