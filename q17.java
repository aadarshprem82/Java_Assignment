import java.io.*;
public class q17 {
    public static void main(String[] args) throws IOException {
        try{
            System.out.println("Dividing by Zero Inside try.");
            int a=10/0;
        }
        catch(Exception e){
            System.out.println("Got Error : "+e.getMessage());
        }
        finally{
            System.out.println("Inside the Finally block.");
        }
    }

}
