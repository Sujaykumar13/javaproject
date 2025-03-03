package javaFile;

import java.io.*;

public class  FileRead {
    public static void main(String[] args) throws IOException {
        File f1 =new File("C:\\Users\\user\\Desktop\\Corejava\\Operators1.java");
        //System.out.println(f1.exists());
        //FileReader fr =new FileReader(f1);
        //System.out.println(fr.read());
        if(f1.exists())
        {
            BufferedReader  bufferedReader =new BufferedReader(new FileReader(f1));//it is a class to read a file
            String line=null;
            while((line=bufferedReader.readLine())!=null)
            {
                System.out.println(line);//reading a file using read method
            }

        }


    }
}
