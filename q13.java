final class fin{

}
class fto extends fin{
    final void first(){
        System.out.print("final method");
    }
}
class q13{
    static final int pi=3;
    void first(){
        System.out.println("changing final");
    }
    public static void main(String...S){
        pi=22;
    }
}
