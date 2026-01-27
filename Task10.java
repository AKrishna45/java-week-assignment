public class Task10 {
    static String secondWordUpper(String str) {
        String[] words = str.split(" ");
        if (words.length < 2) return "LESS";
        return words[1].toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println("Input: 'Hello World' → " + secondWordUpper("Hello World"));
        System.out.println("Input: 'Java Programming' → " + secondWordUpper("Java Programming"));
        System.out.println("Input: 'Single' → " + secondWordUpper("Single"));
        System.out.println("Input: 'The Quick Brown Fox' → " + secondWordUpper("The Quick Brown Fox"));
    }
}
