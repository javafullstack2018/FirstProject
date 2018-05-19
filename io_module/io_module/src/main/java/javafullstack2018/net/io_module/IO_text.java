package javafullstack2018.net.io_module;

import java.io.*;

public class IO_text {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("C:/Users/Kangmin/eclipse-workspace/input.txt");
         out = new FileOutputStream("C:/Users/Kangmin/eclipse-workspace/output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
            System.out.print((char) c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}