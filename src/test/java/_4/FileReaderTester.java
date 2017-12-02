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

//    public static Test suite() {
//        TestSuite suite = new TestSuite();
//        suite.addTest(new FileReaderTester("testRead"));
//        return (Test) suite;
//    }
//
//    public static void main(String[] args) {
//        junit.textui.TestRunner.run((junit.framework.Test) suite());
//    }

}
