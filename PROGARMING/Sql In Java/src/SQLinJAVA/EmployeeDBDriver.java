package SQLinJAVA;

public class EmployeeDBDriver
{
    public static void main(String[] args) {
        EmployeeDB ref = new EmployeeDB("Scott","tiger");

        ref.login("Scott","tiger");

        ref.addEmployee("Smith",7369,20,7902,"CLeark","17/12/1980",800.0,0.0);
        ref.addEmployee("Allen",7499,30,7698,"Salesman","20/02/1981",1600.0,300.0);
        ref.addEmployee("Ward",7521,30,7698,"Salesman","22/20/1981",1250.0,500.0);
        ref.addEmployee("Jones",7566,20,7839,"Manager","02/04/1981",2975.0,0.0);
        ref.addEmployee("Martin",7654,30,7698,"Salesman","28/09/1981",1250.0,1400.0);
        ref.addEmployee("Blake",7698,30,7839,"Maganer","01/05/1981",2850.0,0.0);
        ref.addEmployee("Clark",7782,10,7839,"Manager","09/06/1981",2450.0,0.0);
        ref.addEmployee("Scott",7788,20,7566,"Analyst","19/04/1987",3000.0,0.0);
        ref.addEmployee("King",7839,10,-1,"President","17/11/1981",5000.0,0.0);
        ref.addEmployee("Turner",744,30,7698,"Salesman","08/09/1981",1500.0,0.0);
        ref.addEmployee("Admans",7876,20,7788,"Cleark","23/05/1987",1100.0,0.0);
        ref.addEmployee("James",7900,30,7698,"CLeark","03/12/1981",950.0,0.0);
        ref.addEmployee("Ford",7902,20,7566,"Analyst","03/12/1981",3000.0,0.0);
        ref.addEmployee("Miller",7934,10,7782,"Cleark","23/01/1982",1300.0,0.0);


        //ref.showdb();
        //ref.searchByDeptNo(30);
        //ref.searchByJob("Manager");
        ref.searchBySal(2500);
    }
}
