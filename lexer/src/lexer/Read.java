package lexer;

import java.util.Scanner;

public class Read {
    private Scanner scanner;
    private String line;
    public String[] words;
    public Read() {
        /**
         * This class is a scanner that resolves a line of commands into a series of words.
         */
        scanner = new Scanner(System.in);
        line = scanner.nextLine();
        words = line.split(" ");
    }
}
