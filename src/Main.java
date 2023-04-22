import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        StringReverter reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.println("введите строку в формате String");
        String word = scanner.nextLine();
        System.out.println(reverse.revert(word));
    }

    @FunctionalInterface
    interface StringReverter {
        String revert(String str);
    }
}