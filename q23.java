public class q23{
    public static void main(String[] args) {
        int p;
        char q;
        String a = "Java";
        String b = "   Python";
        String c = "Java";
        String d = "JAVA";
        p = a.length();
        System.out.println("Length : "+p);
        q = b.charAt(2);
        System.out.println("Character at 2 is "+q);
        System.out.println("Uppercase is "+b.toUpperCase());
        System.out.println("Trim is used, \n"+b.trim()+"\nLowercase is "+ b.toLowerCase()+"\nCombined String "+a.concat(b)+"\nComparing "+a.equals(c)+"\nCompare with Ignore "+a.equalsIgnoreCase(c));
    }

}
