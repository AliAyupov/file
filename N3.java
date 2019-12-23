import java.io.*;
public class N3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
            String[] arr=s.split(":");
            for (int i=0; i<arr.length;i++){
                System.out.println(arr[i].trim());
            }
        }
    }
}