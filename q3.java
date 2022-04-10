import java.util.*;
public class q3{
    public static void main(String...S){
        Scanner s= new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter First number : ");
        a=s.nextInt();
        System.out.print("Enter Second number : ");
        b=s.nextInt();
        System.out.println("Before Interchange : a = "+a+" b = "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After Interchange : a = "+a+" b = "+b);
    }
}
