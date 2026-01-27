public class Task7 {
    static int uniqueDigitCount(int n) {
        boolean[] seen = new boolean[10];
        int count = 0;

        while (n > 0) {
            int d = n % 10;
            if (!seen[d]) {
                seen[d] = true;
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Unique digits in 12321: " + uniqueDigitCount(12321));
        System.out.println("Unique digits in 111: " + uniqueDigitCount(111));
        System.out.println("Unique digits in 123456789: " + uniqueDigitCount(123456789));
        System.out.println("Unique digits in 1000: " + uniqueDigitCount(1000));
    }
}
