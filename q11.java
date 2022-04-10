public class q11{
    public static int sum(int x, int y){
        return (x + y);
    }
    public static int sum(int x, int y, int z){
        return (x + y + z);
    }
    public static double sum(double x, double y){
        return (x + y);
    }
    public static void main(String...S){
        System.out.println(sum(10, 20)+" "+sum(10, 20, 30)+" "+sum(10.5, 20.5));
    }
}
