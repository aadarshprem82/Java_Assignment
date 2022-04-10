import java.util.*;
class mat{
    Scanner s=new Scanner(System.in);
    int[][] ar=new int[2][2];
    public void input(){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                ar[i][j]=s.nextInt();
    }}}
}
public class q5{
    public static void sum(mat f,mat s){
        int[][] to=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                to[i][j]=f.ar[i][j]+s.ar[i][j];
        }}
        for(int i=0;i<2;i++){
            System.out.print("| ");
            for(int j=0;j<2;j++){
                System.out.print(to[i][j]+" ");
            }
            System.out.print("|\n");
        }
    }
    public static void main(String...S){
        mat first=new mat();
        mat second = new mat();
        first.input();
        second.input();
        sum(first,second);
    }
}
