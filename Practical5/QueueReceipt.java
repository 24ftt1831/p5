package Practical5;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.println("Receipt generated. Thank you.");
        
        String filename = "C:/Practical5/QReceipt.txt";
        FileWriter fw = new FileWriter(filename, true);

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = 
        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedLdt = ldt.format(dtf);
    
        fw.write(formattedLdt.toString()+"\n\n");

        double random1 = Math.random()*100;
        int random2 = (int) random1;

        fw.write("Hi, "+name.toUpperCase()+"\n\n");

        fw.write("Your Queue No is: "+random2);

        fw.close();

        input.close();

    }
}

