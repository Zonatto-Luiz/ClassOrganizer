import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // write your code here
        String text = "/Projects/ClassOrganizer/src/FallSemester10.pdf";

        PDFExtract pdfExt = new PDFExtract();
        pdfExt.extractWords(text);
        

        ArrayList<String> list = pdfExt.getStringList();
        ArrayList<Course> listC = new ArrayList<>();
        
        System.out.println(pdfExt.toString());
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
