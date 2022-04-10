public class q1{
    public static void main(String...S){
        int p,r,t,n;
        p=Integer.parseInt(S[0]);
        r=Integer.parseInt(S[1]);
        t=Integer.parseInt(S[2]);
        n=Integer.parseInt(S[3]);
        System.out.println("Simple Interest : "+((p*r*t)/100)+"\nAmount : "+(p*(1+(r/n))*(n*t)));
    }
}
