import java.io.*;
public class q26 {
    public static void writing(FileWriter ff, String s) throws IOException {
        for (int i = 0; i < s.length(); i++) {
            ff.write(s.charAt(i));
        }
        ff.write(" ");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String sname,tname, sid,tid, sage,tage, sadd,tadd;
        int r;
        System.out.println("Enter the Details of \nStudent : \nID : ");
        sid = b.readLine();
        System.out.println("Name :");
        sname = b.readLine();
        System.out.println("Age :");
        sage = b.readLine();
        System.out.println("Address :");
        sadd = b.readLine();
        System.out.println("Enter the Details of \nTeacher : \nID : ");
        tid = b.readLine();
        System.out.println("Name :");
        tname = b.readLine();
        System.out.println("Age :");
        tage = b.readLine();
        System.out.println("Address :");
        tadd = b.readLine();
        FileWriter fi = new FileWriter("doct.txt");
        writing(fi, sid);
        writing(fi, sname);
        writing(fi, sage);
        writing(fi, sadd);
        fi.write("\n");
        writing(fi, tid);
        writing(fi, tname);
        writing(fi, tage);
        writing(fi, tadd);
        fi.close();
        System.out.println("Reading From the file");
        FileReader fr = new FileReader("doct.txt");
        while ((r = fr.read()) != -1) {
            System.out.print((char) r);
        }
        fr.close();
    }
}
