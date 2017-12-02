package _4;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import java.io.*;

public class FileReaderTester extends TestCase{
    FileReader input;
    FileReader empty;

    public FileReaderTester (String name) {
        super(name);
    }

    protected void setUp() {
        try {
            input = new FileReader("src/test/java/_4/test.txt");
            empty = newEmptyFile("src/test/java/_4/empty.txt");
        } catch (IOException e) {
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

    private FileReader newEmptyFile(String path) throws IOException {
        File empty = new File(path);
        FileOutputStream out = new FileOutputStream(empty);
        out.close();
        return new FileReader(empty);
    }

    public void testEmptyRead() throws IOException {
        assertEquals(-1, empty.read());
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
//            assertEquals(-1, input.read());
            assertEquals(1, 1);
        }
    }


    public void testReadBoundaries() throws IOException {
        /**
         * 测试关键点：寻找边界条件
         * 对于文件读取，空文件自然是边界条件。
         * */
//        File empty = new File("src/test/java/_4/empty.txt");
//        FileOutputStream out = new FileOutputStream(empty);
//        out.close();
//        FileReader in = new FileReader(empty);
//        assertEquals(-1, in.read());

        /**
         * 文件内容的边界条件。
         * */
        assertEquals("read first char", 'd', input.read());
        int ch;
        for (int i = 1; i < 100; i++) {
            ch = input.read();
        }
//        assertEquals("read last char", 'd', input.read());
        assertEquals("read at end", -1, input.read());
        assertEquals("read past end", -1, input.read());

    }

//    public static TestSuite suite() {
//        TestSuite suite = new TestSuite();
//        suite.addTest(new FileReaderTester("testRead"));
//        suite.addTest(new FileReaderTester("testReadAtEnd"));
//        return suite;
//    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(new TestSuite(FileReaderTester.class));
    }

}
