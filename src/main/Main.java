package main;

import java.io.File;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // write your code here
        //String text = "/Projects/ClassOrganizer/src/FallSemester10.pdf";

        try {
            File file = new File("C:\\FallSemester10.pdf");
            PDFExtract pdfExt = new PDFExtract();
            pdfExt.extractWords(file);
            ArrayList<String> list = pdfExt.getStringList();
            ArrayList<Course> listC = new ArrayList<>();

            System.out.println(pdfExt.toString());
        }catch(Exception e){
            System.out.println("File not found");
        }

    }

        
/*
        for (int x=0; x < list.size(); x++) {
            listC.add(new Course(
            list.get(x),
            list.get(x+1),
            list.get(x+2),
            list.get(x+3),
            list.get(x+4),
            list.get(x+5),
            list.get(x+6),
            list.get(x+7),
            list.get(x+8),
            list.get(x+9)           
            ));
        }
        
        for(Course c:listC){
            c.print();
        }
    }*/

}
