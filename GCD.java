public class GCD {
    static int a = 10, b = 20;

    public static void main(String args[]) {
        int y = gcd(a,b);
        System.out.println("GCD OF" + a + "and" + b + "is" + y);
    }

    static int gcd(int a, int b)

    {
        int min = a < b ? a : b;
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }

}
