public class DivisibilityByThreeSimple {
    static boolean isDivisibleBy3(int n) {
        
        
        while (n > 3) {
            int sum = 0;
            while (n > 0) {
                sum += n & 1;
                n = n >> 1;   
                sum -= n & 1; 
                n = n >> 1;   
            }
            n = Math.abs(sum); 
        }
        
        return (n == 0 || n == 3);
    }

    public static void main(String[] args) {
        int num = 27; 
        if (isDivisibleBy3(num))
            System.out.println(num + " is divisible by 3");
        else
            System.out.println(num + " is not divisible by 3");
    }
}
