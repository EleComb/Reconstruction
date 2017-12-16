package _1.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadSize {

    public static void main(String[] args) {
        ReadSize readSize = new ReadSize();

        System.out.println(readSize.readHead());
    }

    private File getFile() {
        return new File("E:/temp/1.txt");
    }

    public String readHead(){
        final byte[] readSize = new byte[256];
        try {
            FileInputStream fis = new FileInputStream(getFile());
            int length = 0;
            String result = null;
            if((length =  fis.read(readSize)) != -1)
                result = new String(readSize, 0, length);
            fis.close();
            if(result != null)
                return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
