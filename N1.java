public class N1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double r = Math.random();
        n = (int)(r * n);
        System.out.println(n);
    }
}