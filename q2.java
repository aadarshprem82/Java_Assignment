import java.util.*;
public class q2{
    public static void main(String...S){
        Scanner s = new Scanner(System.in);
        int sal;
        System.out.print("Enter Your Salary : ");
        sal=s.nextInt();
        System.out.println("Gross Salary is "+(sal+(sal*0.1)+(sal*0.06)+(sal*0.09)));
    }
}
