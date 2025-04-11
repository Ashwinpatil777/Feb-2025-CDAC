class GCD {
    static String gcd1(int n) {
        if (n == 2)
            return "gcd(int, int)";
        return "gcd(int, " + gcd1(n - 1) + ")";
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(gcd1(n));  
    }
}
