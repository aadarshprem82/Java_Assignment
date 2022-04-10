import java.util.*;
interface sales{
    public void cinput();
    public void cshow();
    public void oinput();
    public void oshow();
}
class cust implements sales{
    Scanner c=new Scanner(System.in);
    int cid,cage;
    String cname;
    public void cinput(){
        System.out.println("Enter your Name :");
        cname=c.next();
        System.out.println("Enter your ID :");
        cid=c.nextInt();
        System.out.println("Enter your Age :");
        cage=c.nextInt();
    }
    public void cshow(){
        System.out.println("Customer's \nName : "+cname);
        System.out.println("ID : "+cid);
        System.out.println("Age : "+cage);
    }
    public void oshow(){}
    public void oinput(){}
}
class order implements sales{
    Scanner o=new Scanner(System.in);
    int orderid;
    float orderprice;
    String ordername;
    public void oinput(){
        System.out.println("Enter Order ID :");
        orderid=o.nextInt();
        System.out.println("Enter the Price :");
        orderprice=o.nextFloat();
        System.out.println("Enter the Order:");
        ordername=o.next();
    }
    public void oshow(){
        System.out.println("Order's\nID : "+orderid);
        System.out.println("Price : "+orderprice);
        System.out.println("Name : "+ordername);
    }
    public void cinput(){}
    public void cshow(){}
}
public class q14 {
    public static void main(String[] args) {
        cust C1=new cust();
        C1.cinput();
        C1.cshow();
        order C2=new order();
        C2.oinput();
        C2.oshow();
    }

}
