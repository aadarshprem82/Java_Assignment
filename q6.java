import java.util.*;
class student{
    int sid, sage;
    String sname, scourse;
    Scanner s= new Scanner(System.in);
    void input(){
        System.out.print("Enter your Details\nID : ");
        sid=s.nextInt();
        System.out.print("Name : ");
        sname=s.next();
        System.out.print("Age : ");
        sage=s.nextInt();
        System.out.print("Course : ");
        scourse=s.next();
    }
    void disp(){
        System.out.print("\nID : "+sid+"\nName : "+sname+"\nAge : "+sage+"\nCourse : "+scourse);
    }
    void showage(){
        System.out.print("\n"+(sage>18?(sname+" is "):sname+" not ")+"above 18.");
    }
    void showcourse(){
        System.out.print("\n"+(scourse.equals("BCA")?"He is a "+scourse+" student.":"He's not a BCA student"));
    }
}
public class q6{
    public static void main(String...S){
        student s1=new student();
        student s2=new student();
        s1.input();
        s2.input();
        s1.disp();
        s1.showage();
        s1.showcourse();
        s2.disp();
        s2.showage();
        s2.showcourse();
    }
}
