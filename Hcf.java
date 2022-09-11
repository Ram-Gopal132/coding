public class Hcf {
    public static void main(String[] args) {
        int a = 95;
        int b = 60;
        int gcd = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                System.out.println(i);
            }

        }
        System.out.print("gcd of=" + gcd);
    }
}
