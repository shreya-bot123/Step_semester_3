package week6.assignment;
public class Course {
    String code,title; int credits,labCredits;
    public Course(String code,String title,int credits,int labCredits) {
        this.code=code; this.title=title; this.credits=credits; this.labCredits=labCredits;
    }
    public Course(String code,String title,int credits) { this(code,title,credits,0); }
    public int totalCredits() { return credits+labCredits; }
    public static void main(String[] args) {
        Course a=new Course("21CSC201J","Data Structures",4);
        Course b=new Course("21CSC205L","DSA Lab",3,1);
        System.out.println(a.code+" total credits: "+a.totalCredits());
        System.out.println(b.code+" total credits: "+b.totalCredits());
    }
}
