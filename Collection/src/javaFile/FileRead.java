package javaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        File f1 =new File("C:\\Users\\user\\Desktop\\Corejava\\Operators1.java");
        System.out.println(f1.exists());
        FileReader fr =new FileReader(f1);
        System.out.println(fr.read());

    }
}
