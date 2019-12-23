import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double sum = 0.0;
        int n = 0;
        while (in.hasNext()) {
            double x =in.nextDouble();
            sum += x;
            n++;
            System.out.println(sum/n);
        }

    }
}
