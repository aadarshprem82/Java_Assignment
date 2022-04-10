import java.util.*;
class student{
    Scanner s=new Scanner(System.in);
    int sid,sage;
    String sname;
    public void studinfo(){
        System.out.print("Enter the Student's Details : \nID : ");
        sid=s.nextInt();
        System.out.print("Name : ");
        sname=s.next();
        System.out.print("Age : ");
        sage=s.nextInt();
    }
    public void showinfo1(){
        System.out.print("\nStudent,\n\t\tName : "+sname+"\n\t\tID : "+sid+"\n\t\tAge : "+sage);
    }
}
class teacher extends student{
    int tid,tage;
    String tname;
    public void teacherinfo(){
        System.out.print("Enter the Teacher's Details : \nID : ");
        tid=s.nextInt();
        System.out.print("Name : ");
        tname=s.next();
        System.out.print("Age : ");
        tage=s.nextInt();
    }
    public void showinfo(){
        System.out.print("\nTeacher,\n\t\tName : "+tname+"\n\t\tID : "+tid+"\n\t\tAge : "+tage);
    }
}
public class q7{
    public static void main(String...S){
        teacher t1=new teacher();
        t1.teacherinfo();
        t1.studinfo();
        t1.showinfo();
        t1.showinfo1();
    }
}
