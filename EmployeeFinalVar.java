public class EmployeeFinalVar {
    final static String orgname2="ANNA-CANADA University";
    int empno;
    String ename;
    int  salary;
    String branch;
    EmployeeFinalVar(int empno,String ename,int  salary,String branch,String orgname2)
    {
        this.empno=empno;
        this.ename=ename;
        this.salary=salary;
        this.branch=branch;
    }
    public void setEmployeelists()
    {
        System.out.println(empno+" "+ename+" "+salary+" "+branch+ " "+orgname2);
    }
}
