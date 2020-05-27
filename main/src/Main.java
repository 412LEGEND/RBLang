import parser.Parser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                new Parser();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
