package doctor;
import java.util.*;
public class doc{
    int did, dage;
    String dname;
    Scanner s=new Scanner(System.in);
    public void dinfo(){
        System.out.println("Enter the Details,\nID : ");
        did=s.nextInt();
        System.out.println("Name : ");
        dname=s.next();
        System.out.println("Age : ");
        dage=s.nextInt();
    }
    public void dshow(){
        System.out.println("\nID : "+did+"\nName : "+dname+"\nAge : "+dage);
    }
}
