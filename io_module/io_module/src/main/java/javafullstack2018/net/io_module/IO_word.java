package javafullstack2018.net.io_module;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class IO_word {

   public static void main(String[] args)throws Exception  {
   
      //Blank Document
      XWPFDocument document = new XWPFDocument(); 
		
      //Write the Document in file system
      FileOutputStream out = new FileOutputStream( new File("C:/Users/Kangmin/eclipse-workspace/new_doc.docx"));
      document.write(out);
      out.close();
      System.out.println("createdocument.docx written successully");
      
    //Closing the document  
      document.close();
   }
}

