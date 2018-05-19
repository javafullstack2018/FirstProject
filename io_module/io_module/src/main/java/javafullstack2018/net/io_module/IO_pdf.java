package javafullstack2018.net.io_module;

import java.io.File;
import java.io.IOException; 
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
  
public class IO_pdf {
    
   public static void main (String args[]) throws IOException {
       
	  //Loading an existing document 
	  File file = new File("C:/Users/Kangmin/eclipse-workspace/constants.pdf"); 
	  PDDocument document = PDDocument.load(file); 
      
	  System.out.println("PDF loaded"); 
      
      //Adding a blank page to the document 
      document.addPage(new PDPage()); 
	  
      //Saving the document
      document.save("C:/Users/Kangmin/eclipse-workspace/new_doc.pdf");
         
      System.out.println("PDF modified");  
    
      //Closing the document  
      document.close();

   }  
}