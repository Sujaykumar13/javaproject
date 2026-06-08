package javaFile;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@Slf4j
public class HandlingFile {

    public static void main(String[] args) throws IOException {
        File f1 =  new File("D:\\filehandle.docx");
        System.out.println(f1.exists());
        FileWriter fw = new FileWriter(f1);
        fw.write("sujay");
        FileReader fr =new FileReader(f1);
        System.out.println(fr.read());
    }
}
