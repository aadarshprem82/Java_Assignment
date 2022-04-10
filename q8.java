class college {
 public void move() {
  System.out.println("College is open");
 }
}
class univ extends college {
 public void move() {
  System.out.println("University is open too");
 }
}
public class q8 {
 public static void main(String args[]) {
  college a = new college();
  college b = new univ();
  a.move();
  b.move();
 }
}
