import java.io.File;
import java.util.ArrayList;
import java.util.regex.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;



public class PDFExtract {


    private ArrayList<String> stringList = new ArrayList<>();


    public void extractWords(String text) {
        
        try {
            System.out.println("Loading file....");
            PDDocument pdfDocument = PDDocument.load(new File(text));
            PDFTextStripper pdfStripper = new PDFTextStripper();
            text = pdfStripper.getText(pdfDocument);
            
        } catch (Exception e) {
            System.out.println("Loading Failure!");
        }
        Pattern p = Pattern.compile("\\p{Alnum}*\\p{Alnum}");
        Matcher m = p.matcher(text);

        while (m.find()) {
            stringList.add(m.group());
        }
    }


    public ArrayList<String> getStringList() {
        return stringList;
    }
    
    public String toString(){
        String text="";
        
        for(String word:stringList){
            
            text += word+" ";
            
        }
        
        return text;
    }
}
