package main;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PDFExtract {


    private ArrayList<String> stringList = new ArrayList<>();


    public void extractWords(File file) {
        String text="";

        try {
            System.out.println("Reading file....");
            PDDocument pdfDocument = PDDocument.load(file);
            PDFTextStripper pdfStripper = new PDFTextStripper();
            text = pdfStripper.getText(pdfDocument);
            
        } catch (Exception e) {
            System.out.println("Reading Failure!");
        }
        Pattern p = Pattern.compile("\\p{Alnum}*\\p{Alnum}");
        Matcher m = p.matcher(text);

        while (m.find()) {
            m.group();
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
