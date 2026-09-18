package week6.practice;
public class PayrollAccount {
    private double basicSalary,bonus;
    public PayrollAccount(double basicSalary) {
        if(basicSalary<0){System.out.println("Invalid basic salary. Starting with 0.");this.basicSalary=0;}
        else this.basicSalary=basicSalary;
    }
    public void creditBonus(double amount) {
        if(amount<=0) System.out.println("Bonus rejected: amount must be positive");
        else {bonus+=amount;System.out.println("Bonus credited: Rs "+amount);}
    }
    public void deductTax(double percent) {
        if(percent<0||percent>100) System.out.println("Tax rejected: percent must be between 0 and 100");
        else {basicSalary-=basicSalary*percent/100;System.out.println("Tax deducted: "+percent+"%");}
    }
    public double getNetSalary(){return basicSalary+bonus;}
    public static void main(String[] args){
        PayrollAccount a=new PayrollAccount(50000); a.creditBonus(5000); a.deductTax(10);
        System.out.println("Net salary: Rs "+a.getNetSalary());
    }
}
