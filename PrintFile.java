package JavaNewPractical;

import java.io.*;

public class PrintFile {
    public static void main(String[] args) {
        String str, path = "D:\\Codes\\JavaPractical\\src\\JavaNewPractical\\PrintFile.txt";
        
        try(BufferedReader Buffer = new BufferedReader(new FileReader(path))) {
            str = Buffer.readLine();
            while(str != null) {
                if(str.charAt(0) == '/' && str.charAt(1) == '/')
                    System.out.println(str);
                str = Buffer.readLine();
            }
        } catch(IOException E) {
            System.out.println("Error Reading File!!!");
        }
    }
}
