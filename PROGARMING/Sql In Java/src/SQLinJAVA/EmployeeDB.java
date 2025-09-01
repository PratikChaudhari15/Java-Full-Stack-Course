package SQLinJAVA;

import java.util.Arrays;

public class EmployeeDB
{
    private String user;
    private String pass;
    private boolean connect;
    private Employee [] db = new Employee[10];
    private int count = 0;
    private int index = 0;

    private EmployeeDB(){

    }
    public EmployeeDB(String user,String pass)
    {
        super();
        this.user = user;
        this.pass = pass;

        System.out.println("DB Crwated");
    }

    public void login (String user,String pass)
    {
        if (this.user.equals(user)&& this.pass.equals(pass))
        {
            connect = true;
            System.out.println("DAtabase COnnected");
        }
        else
        {
            System.out.println("could not Resolve the Connect Identifier Specified");
        }
    }
    public boolean addEmployee(String name,int empid,int deptNo,int managerNo,String job,String hireDate,double sal,double comm)
    {
        if (connect && count<0.75* db.length)
        {
            db[index] = new Employee(name,empid,deptNo,managerNo,job,hireDate,sal,comm);
            count++;
            index++;


            //System.out.println(name+ "Employee Added");
            return true;
        }
        else if(connect)
        {
            Employee[] temp = new Employee[db.length*2];
            for (int i = 0;i<db.length;i++)
            {
                temp[i] = db[i];
            }
            db = temp;
            db[index] = new Employee(name,empid,deptNo,managerNo,job,hireDate,sal,comm);
            count++;
            index++;
            //System.out.println(name+ "Employee Added");
            return true;
        }
        else
        {
            System.out.println("Could Not Resolve the connect Identifirer Speciied");
            return false;
        }
    }
    public void showdb()
    {
        if (connect)
        {
            for (int i = 0;i<count;i++)
            {
                System.out.println(db[i]);
            }
        }
        else {
            System.out.println("could not reslove the connext Identifier Specifed");
        }
    }
    public void searchByJob(String job)
    {
        if (connect)
        {
            for (int i = 0; i<count;i++)
            {
                if (db[i].job.equalsIgnoreCase(job))
                {
                    System.out.println(db[i]);
                }
            }
        }
    }
    public void searchByDeptNo(int depNo)
    {
        if (connect)
        {
            for (int i= 0; i<count;i++)
            {
                if (db[i].depNo==depNo)
                {
                    System.out.println(db[i]);
                }
            }
        }
    }
    public void searchBySal(int sal)
    {
        for (int i =0;i<count;i++)
        {
            if (db[i].sal<sal)
            {
                System.out.println(db[i]);
            }
        }
    }


}
