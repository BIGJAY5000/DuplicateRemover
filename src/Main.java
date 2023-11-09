import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        String current;
        String newWord = "";
        System.out.println("Please enter a string");
        s = scan.nextLine();
        for (int i = 0; i < s.length(); i++) {
            current = s.substring(i, i + 1);
            if (i == 0 || !s.substring(0, i).contains(current)) {
                newWord = newWord + current;
            }
        }
        System.out.println("Your new word is " + newWord);
    }
}