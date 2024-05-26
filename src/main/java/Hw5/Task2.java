package Hw5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int[] ar2 = {1,2,3,1,2,3,1,2,0};
        writeToFileMas(ar2);


    }
    public static void writeToFileMas(int[] ar2) throws IOException {
        FileOutputStream fos = new FileOutputStream("save1.out");
        for (int b = 0;b < 3; b++){
            byte wr = 0;
            for (int v = 0; v<3;v++){
                wr += (byte) (ar2[3*b + v]) <<(v*2);
            }
            fos.write(wr);
        }
        fos.flush();
        fos.close();
    }
}
