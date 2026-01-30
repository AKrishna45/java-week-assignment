public class Task1 {
    public int EvenOddDigitsSum(int input1, String input2) {
        int sum = 0;
        while (input1 > 0) {
            int d = input1 % 10;
            if (input2.equals("even") && d % 2 == 0) sum += d;
            if (input2.equals("odd") && d % 2 != 0) sum += d;
            input1 /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Task1 task = new Task1();
        System.out.println(task.EvenOddDigitsSum(12345, "even"));   // Expected: 6
        System.out.println(task.EvenOddDigitsSum(12345, "odd"));    // Expected: 9
    }
}
