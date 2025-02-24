package clone;

public class Employee implements Cloneable{
    int i;
    Address address;
    public Employee(int i,Address address)
    {
        this.i=i;
        this.address=address;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address1=new Address(10);
        Employee emp=new Employee(20,address1);
        System.out.println(emp.i);
        System.out.println(emp.address.j);
        Employee emp1= (Employee) emp.clone();
        emp1.address.j=50;
        System.out.println(emp1.i);
        System.out.println(emp1.address.j);
        System.out.println(emp.i);
        System.out.println(emp.address.j);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address add=new Address(this.address.j);
        Employee e=new Employee(this.i,add);
        return e;
    }
}
