public class Task6 {
    static int sumOfPowerDigits(int n) {
        int temp = n, sum = 0;
        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of power digits of 153: " + sumOfPowerDigits(153));
        System.out.println("Sum of power digits of 370: " + sumOfPowerDigits(370));
        System.out.println("Sum of power digits of 9474: " + sumOfPowerDigits(9474));
    }
}
