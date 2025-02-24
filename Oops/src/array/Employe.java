package array;

public class Employe {
    private int empId;
    private String name;
    private String dept;
    private String loc;

    public Employe(int empId, String name, String dept, String loc) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.loc = loc;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getLoc() {
        return loc;
    }

    public String toString() {
        return "employee id-" + empId + " name-" + name + " dept" + dept + "location-" + loc;
    }
}
