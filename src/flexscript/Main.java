package flexscript;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        try {

            System.out.println("Reading file.......");

            final String dir = System.getProperty("user.dir");

            System.out.println(dir + "/input/Code01.script");

            String raw = read(dir + "/input/Code01.script");

            BaseLexer l = new BaseLexer(raw);

            String raw_lex = l.to_string_token();

            String value, token;
            int line, pos;
            //Token t;
            boolean found;

            List<Parser.Token> list = new ArrayList<>();
            Map<String, Parser.TokenType> str_to_tokens = new HashMap<>();

            //Associates Token types with corresponding strings.
            str_to_tokens.put("End_of_input", Parser.TokenType.End_of_input);
            str_to_tokens.put("Op_multiply", Parser.TokenType.Op_multiply);
            str_to_tokens.put("Op_divide", Parser.TokenType.Op_divide);
            str_to_tokens.put("Op_mod", Parser.TokenType.Op_mod);
            str_to_tokens.put("Op_add", Parser.TokenType.Op_add);
            str_to_tokens.put("Op_subtract", Parser.TokenType.Op_subtract);
            str_to_tokens.put("Op_negate", Parser.TokenType.Op_negate);
            str_to_tokens.put("Op_not", Parser.TokenType.Op_not);
            str_to_tokens.put("Op_less", Parser.TokenType.Op_less);
            str_to_tokens.put("Op_lessequal", Parser.TokenType.Op_lessequal);
            str_to_tokens.put("Op_greater", Parser.TokenType.Op_greater);
            str_to_tokens.put("Op_greaterequal", Parser.TokenType.Op_greaterequal);
            str_to_tokens.put("Op_equal", Parser.TokenType.Op_equal);
            str_to_tokens.put("Op_notequal", Parser.TokenType.Op_notequal);
            str_to_tokens.put("Op_assign", Parser.TokenType.Op_assign);
            str_to_tokens.put("Op_and", Parser.TokenType.Op_and);
            str_to_tokens.put("Op_or", Parser.TokenType.Op_or);
            str_to_tokens.put("Keyword_for", Parser.TokenType.Keyword_for);
            str_to_tokens.put("Keyword_if", Parser.TokenType.Keyword_if);
            str_to_tokens.put("Keyword_else", Parser.TokenType.Keyword_else);
            str_to_tokens.put("Keyword_elif", Parser.TokenType.Keyword_elif);//
            str_to_tokens.put("Keyword_while", Parser.TokenType.Keyword_while);
            str_to_tokens.put("Keyword_print", Parser.TokenType.Keyword_print);
            str_to_tokens.put("Keyword_putc", Parser.TokenType.Keyword_putc);
            str_to_tokens.put("LeftParen", Parser.TokenType.LeftParen);
            str_to_tokens.put("RightParen", Parser.TokenType.RightParen);
            str_to_tokens.put("LeftBrace", Parser.TokenType.LeftBrace);
            str_to_tokens.put("RightBrace", Parser.TokenType.RightBrace);
            str_to_tokens.put("Semicolon", Parser.TokenType.Semicolon);
            str_to_tokens.put("Comma", Parser.TokenType.Comma);
            str_to_tokens.put("Identifier", Parser.TokenType.Identifier);
            str_to_tokens.put("Integer", Parser.TokenType.Integer);
            str_to_tokens.put("String", Parser.TokenType.String);

            Scanner s = new Scanner(raw_lex);

            while (s.hasNext()) {
                String str = s.nextLine();
//                System.out.println(str + " WOW"); // debug
                StringTokenizer st = new StringTokenizer(str);
                line = Integer.parseInt(st.nextToken());
                pos = Integer.parseInt(st.nextToken());
                token = st.nextToken();
                value = "";

                while (st.hasMoreTokens()) {
                    value += st.nextToken() + " ";
                }
//                System.out.println(value); // debug
//                System.out.println(token); // debug
                found = false;
                if (str_to_tokens.containsKey(token)) {
                    found = true;
                    list.add(new Parser.Token(str_to_tokens.get(token), value, line, pos));
                }
                if (found == false) {
                    throw new Exception("Token not found: '" + token + "'");
                }
            }
            //
            Parser p = new Parser(list);
//            p.printAST(p.parse());
        } catch (Exception e) {
            Parser.error(-1, -1, "Exception fuck: " + e.getMessage());
        }
    }


    private static String read(String target_file) {
        StringBuffer output = new StringBuffer();
        try {
            File myObj = new File(target_file);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                output.append(myReader.nextLine() + "\n");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
//        System.out.println(output.toString());
        return output.toString();
    }
}
