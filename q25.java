import java.io.*;
public class q25 {
    public static void writing(FileWriter ff, String s) throws IOException {
        for (int i = 0; i < s.length(); i++) {
            ff.write(s.charAt(i));
        }
        ff.write(" ");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String dname, did, dage, dadd;
        int r;
        System.out.println("Enter the Details :\n ID : ");
        did = b.readLine();
        System.out.println("Name :");
        dname = b.readLine();
        System.out.println("Age :");
        dage = b.readLine();
        System.out.println("Address :");
        dadd = b.readLine();
        FileWriter fi = new FileWriter("doct.txt");
        writing(fi, did);
        writing(fi, dname);
        writing(fi, dage);
        writing(fi, dadd);
        fi.close();
        System.out.println("Reading From the file");
        FileReader fr = new FileReader("doct.txt");
        while ((r = fr.read()) != -1) {
            System.out.print((char) r);
        }
        fr.close();
    }
}
