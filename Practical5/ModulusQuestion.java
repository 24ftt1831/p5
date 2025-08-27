package Practical5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException {
        
        new File ("C:\\Practical5").mkdir();
        System.out.println("A new question added");
        
        String filename = "C:/Practical5/Modulus Questions.txt";
        FileWriter fw = new FileWriter(filename, true);

        double random1 = Math.random()*100;
        int random2 = (int) random1;

        double random3 = Math.random()*100;
        int random4 = (int) random3;

        fw.write(random2 + " % " +random4 + " = ?" + "\r\n");

        fw.close();

    }
}

