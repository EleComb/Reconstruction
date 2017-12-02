package _4;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTester extends TestCase{
    FileReader input;

    public FileReaderTester (String name) {
        super(name);
    }

    protected void setUp() {
        try {
            input = new FileReader("src/test/java/_4/test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void tearDown() {
        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void  testRead() throws IOException {
        char ch = '&';
        for (int i = 0; i < 4; i++) {
            ch = (char) input.read();
            assert ('d' == ch);
        }
    }

    public void testReadAtEnd() throws IOException {
        int ch = -1234;
        for (int i = 0; i < 141; i++) {
            ch = input.read();
            assertEquals(-1, input.read());
        }
    }

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new FileReaderTester("testRead"));
        suite.addTest(new FileReaderTester("testReadAtEnd"));
        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
