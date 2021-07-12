package JavaNewPractical;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        FileInputStream fin;
        FileOutputStream fout;
        int i;
        
        // Checking for Command Line Arguments
        // Use complete path in Command Line Arguments
        if(args.length != 2) {
            System.out.println("FileName Not Found!!!");
            return;
        }
        
        // Opening the files and copying the files with exception handling
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            
            do {
                i = fin.read();
                if(i != -1)
                    fout.write((char)i);
            }while(i != -1);
            
            fin.close();
            fout.close();
            
        } catch(FileNotFoundException E) {
            System.out.println("Can't open File!!!");
            System.exit(0);
        } catch(IOException E) {
            System.out.println("Error Copying File!!!");
        }       
    }
}
