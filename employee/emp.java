package employee;
import java.util.*;
public class emp{
    int eid,eage;
    String ename, eaddress;
    Scanner s = new Scanner(System.in);
    public void empinfo(){
        System.out.println("Enter your Details,\nID : ");
        eid=s.nextInt();
        System.out.println("Name : ");
        ename=s.next();
        System.out.println("Age : ");
        eage=s.nextInt();
        System.out.println("Address : ");
        eaddress=s.next();
    }
    public void eshow(){
        System.out.println("\nID : "+eid+"\nName : "+ename+"\nAge : "+eage+"\nAddress : "+eaddress);
    }
}
