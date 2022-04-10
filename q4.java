import java.util.*;
public class q4{
    public static void main(String...S){
        int a,b,c;
        a=Integer.parseInt(S[0]);
        b=Integer.parseInt(S[1]);
        c=Integer.parseInt(S[2]);
        System.out.println((a>b&&a>c?a:(b>a&&b>c?b:(c>a&&c>b?c:a)))+" is the Greatest Number");
    }
}
