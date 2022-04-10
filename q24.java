public class q24 {
    public static void main(String[] args) {
        StringBuffer S= new StringBuffer("Buffered");
        System.out.println(S);
        System.out.println("String Capacity = "+S.capacity());
        S.append("red");
        System.out.println(S);
        System.out.println("String Capacity = "+S.capacity());
        System.out.println(S);
        System.out.println(S.delete(6,11));
        System.out.println(S);
        S.insert(6,"ing");
        System.out.println(S);
    }
}
