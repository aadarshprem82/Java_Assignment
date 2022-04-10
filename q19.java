import java.io.*;
public class q19 {
    static void test(Object o){
        System.out.println(o.toString());
    }
    static void mythrow(){
        try{
            throw new NullPointerException("Created Exception");
        }
        catch(NullPointerException e){
            System.out.println("Inside mythrow.");
        }
    }
    public static void main(String[] args) throws IOException {
        try{
            test(null);
        }
        catch(NullPointerException e){
            mythrow();
        }
    }
}
