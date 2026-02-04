import java.util.*;
import java.util.stream.*;

public class SecondHighest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        int n = sc.nextInt();

        // Read list elements
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Find second highest using Stream API
        Optional<Integer> secondHighest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        // Print result
        if (secondHighest.isPresent()) {
            System.out.println(secondHighest.get());
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}
