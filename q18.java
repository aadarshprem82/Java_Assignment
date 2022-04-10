public class q18 {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Divide by Zero"+(5/0));
            }
            catch(ArithmeticException a){
                System.out.println("The exception occurred is "+a.getMessage());
            }
        }
        catch(Exception e){
            System.out.println("Handled all Exception.");
        }
        finally{
            System.out.println("All the exceptions are handled carefully.");
        }
    }
}
