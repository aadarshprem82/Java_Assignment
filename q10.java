abstract class A {
    abstract void m1();
    void m2(){
        System.out.println("This is inside an Abstract Class.");
    }
}
class B extends A {
    void m1(){
        System.out.println("Implementation of Abstract Method m1.");
    }
}
public class q10{
    public static void main(String...S){
        B b = new B();
        b.m1();
        b.m2();
    }
}
