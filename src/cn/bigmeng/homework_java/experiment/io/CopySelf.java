package cn.bigmeng.homework_java.experiment.io;

import java.io.*;
import java.net.URL;

public class CopySelf {
    public static void main(String[] args) throws IOException {
        File file = new File("CopySelf.java.copy");
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        URL slef = CopySelf.class.getResource("");
        File srcFile = new File(slef.getPath(), "CopySelf.class");
        InputStream srcIn = new FileInputStream(srcFile);
        byte[] buf = new byte[1024];
        int len;
        while ((len = srcIn.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        System.out.println("Copy src file location is "+file.getAbsolutePath());
        fos.close();
        srcIn.close();
    }
}
