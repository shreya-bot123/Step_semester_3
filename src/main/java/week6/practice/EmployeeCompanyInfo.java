package week6.practice;
public class EmployeeCompanyInfo {
    String empName; double salary;
    static String companyName="Bright Horizon Technologies"; static int employeeCount=0;
    EmployeeCompanyInfo(String empName,double salary){this.empName=empName;this.salary=salary;employeeCount++;}
    static void printCompanyInfo(){System.out.println(companyName);System.out.println("Employees on record: "+employeeCount);}
    public static void main(String[] args){
        new EmployeeCompanyInfo("Asha",50000);new EmployeeCompanyInfo("Rahul",60000);new EmployeeCompanyInfo("Meera",55000);
        EmployeeCompanyInfo.printCompanyInfo();
    }
}
