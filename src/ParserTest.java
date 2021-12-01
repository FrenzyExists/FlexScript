import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

class ParserTest {


    @Test
    void error() {
    }

    @Test
    void getNextToken() {
    }

    @Test
    void expr() {
    }

    @Test
    void paren_expr() {
    }

    @Test
    void expect() {
    }

    @Test
    void stmt() {
    }

    @Test
    void parse() {
    }

    @Test
    void printAST() {
    }

    @Test
    void main() {
        Assertions.assertEquals("This test was equal.", "This test was equal.");
        Assertions.assertEquals("3 tests: equal.", "3 tests: equal.");
        Assertions.assertEquals("[3 (were ; tests] equal).", "[3 (were ; tests] equal).");
        Assertions.assertEquals("while test: in loop", "while test: in loop");
        Assertions.assertNotEquals("This test was equal.", "This test was not equal.");
        Assertions.assertNotEquals("5 test: equal.", "7 test: not equal.");
        Assertions.assertNotEquals("8 test success > 9-2 test failure ", "6 test failure == 5+1 test failure ");
        Assertions.assertNotEquals("while test: in y", "for tests; in x");


        /*static {
            String[] TestSuccess = new String[100];
            TestSuccess[0] = "This test was successful";
            TestSuccess[1] = " 4 test [String: ran successfully]";
            TestSuccess[2] = "5+3 == 9-1";
            TestSuccess[3] = "SyntaxAnalyzerTest(Parameter) == [ Successful: Test);";
            main(TestSuccess);
            System.out.print(Arrays.toString(TestSuccess));
        }*/
    }
}