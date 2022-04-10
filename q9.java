class circle{
    int r=12;
    public void cir(){
        System.out.println("Circumference of Circle is "+(2*3.14*this.r));
    }
}
class ar extends circle{
    public void area(){
        System.out.println("Area of Circle is "+(3.14*super.r*super.r));
    }
}
public class q9{
    public static void main(String...S){
        circle c1=new circle();
        c1.cir();
        ar c2=new ar();
        c2.area();
    }
}
