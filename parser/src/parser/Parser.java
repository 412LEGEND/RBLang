package parser;

import lexer.Read;
import lexer.Identifier;

public class Parser {
    private boolean isNum(String str) {
        return Character.isDigit(str.charAt(0));
    }

    public Parser() {
        Read read = new Read();
        String[] words = read.words;
        String fn = words[0];
        switch (fn) {
            case "def":
                if (Character.isDigit(words[2].charAt(0))) {
                    new Identifier(words[1], Integer.valueOf(words[2]));
                } else {
                    new Identifier(words[1], Identifier.getValue(words[2]));
                }
                break;
            case "add":
            {
                int op1, op2;
                if (isNum(words[2])) {
                    op1 = Integer.parseInt(words[2]);
                } else {
                    op1 = Identifier.getValue(words[2]);
                }
                if (isNum(words[3])) {
                    op2 = Integer.parseInt(words[3]);
                } else {
                    op2 = Identifier.getValue(words[3]);
                }
                new Identifier(words[1], op1 + op2);
            }
                break;
            case "sub":
            {
                int op1, op2;
                if (isNum(words[2])) {
                    op1 = Integer.parseInt(words[2]);
                } else {
                        op1 = Identifier.getValue(words[2]);
                }
                if (isNum(words[3])) {
                    op2 = Integer.parseInt(words[3]);
                } else {
                    op2 = Identifier.getValue(words[3]);
                }
                new Identifier(words[1], op1 - op2);
            }
                break;
            case "mul":
            {
                int op1, op2;
                if (isNum(words[2])) {
                    op1 = Integer.parseInt(words[2]);
                } else {
                    op1 = Identifier.getValue(words[2]);
                }
                if (isNum(words[3])) {
                    op2 = Integer.parseInt(words[3]);
                } else {
                    op2 = Identifier.getValue(words[3]);
                }
                new Identifier(words[1], op1 * op2);
            }
            case "div":
            {
                int op1, op2;
                if (isNum(words[2])) {
                    op1 = Integer.parseInt(words[2]);
                } else {
                    op1 = Identifier.getValue(words[2]);
                }
                if (isNum(words[3])) {
                    op2 = Integer.parseInt(words[3]);
                } else {
                    op2 = Identifier.getValue(words[3]);
                }
                new Identifier(words[1], op1 / op2);
            }
            case "out":
                if (isNum(words[1])) {
                    System.out.println((char)Integer.parseInt(words[1]));
                } else {
                    System.out.println(Identifier.getValue(words[1]));
                }
            default:
                throw new IllegalStateException("Unexpected value: " + fn);
        }
    }
}
