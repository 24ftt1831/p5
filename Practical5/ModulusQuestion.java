package Practical5;

import java.io.FileWriter;
import java.io.IOException;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException {
        
        String filename = "C:/data/Modulus Questions.txt";
        FileWriter fw = new FileWriter(filename, true);

        double random1 = Math.random()*100;
        int random2 = (int) random1;

        double random3 = Math.random()*100;
        int random4 = (int) random3;

        fw.write(random2 + " % " +random4 + " = ?" + "\r\n");

        fw.close();

    }
}
