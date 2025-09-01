package SQLinJAVA;

public class Employee
{
    String name;
    int empid;
    int depNo;
    int managerNo;
    String hireDate;
    double sal;
    double comm;
    String job;

    public Employee(){

    }
    public Employee(String name,int empid,int depNo,int managerNo,String job, String hireDate,double sal, double comm)
    {
        super();
        this.name = name;
        this.empid = empid;
        this.depNo = depNo;
        this.managerNo=managerNo;
        this.hireDate = hireDate;
        this.sal= sal;
        this.comm = comm;
        this.job = job;
    }
    @Override
    public String toString() {
        return "[name=" + name +
                ", empid=" + empid +
                ", depNo=" + depNo +
                ", job=" + job +
                ", managerNo=" + managerNo +
                ", hireDate=" + hireDate +
                ", sal=" + sal +
                ", comm=" + comm + "]";
    }

}
