package inheritance;
class Employee extends Person{

private double annualsal;
private int year;
private String ins_num;
Employee(String name,double annualsal,int year,String ins_num)
{
super(name);
this.annualsal=annualsal;
this.year=year;
this.ins_num=ins_num;
}
void setAnnualSalary(double annualsal)
{
this.annualsal=annualsal;
}
void setYear(int year)
{
this.year=year;
}
void setInsNum(String ins_num)
{
this.ins_num=ins_num;
}
double getAnnualSalary()
{
return this.annualsal;
}
int getYear()
{
return this.year;
}
String getInsNum()
{
return this.ins_num;
}
String getName()
{
    return super.name;
}
}
