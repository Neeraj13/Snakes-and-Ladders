class Employee
{
private String name,address;
private int year,salary;
public Employee(String n,int y,int sal,String add)
{
name=n;
year=y;
salary=sal;
address=add;
}
public String getName()
{
return name;
}
public int getYear()
{
return year;
}
public int getSalary()
{
return salary;
}
public String getAddress()
{
return address;
 }
}
class Emp
{
public static void main(String args[])
{
Employee e1=new Employee("Robert",1994,30000,"64C-WallsStreet");
Employee e2=new Employee("Sam",2000,20000,"68D-WallsStreet");
Employee e3=new Employee("John",1999,10000,"26B-WallsStreet");
System.out.println("Name\n Year of joining\n Salary\n Address\n");
System.out.println(e1.getName()+"\n"+e1.getYear()+"\n"+e1.getSalary()+"\n"+e1.getAddress());
System.out.println(e2.getName()+"\n"+e2.getYear()+"\n"+e2.getSalary()+"\n"+e2.getAddress());
System.out.println(e3.getName()+"\n"+e3.getYear()+"\n"+e3.getSalary()+"\n"+e3.getAddress());
 }
}

