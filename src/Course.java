public class Course {


    private String subject;
    private String catalog;
    private String nbr;
    private String section;
    private String classNum;
    private String course;
    private String title;
    private String component;
    private String units;
    private String topics;

    Course(String subject,
           String catalog,
           String nbr,
           String section,
           String classNum,
           String course,
           String title,
           String component,
           String units,
           String topics) {
        this.subject = subject;
        this.catalog = catalog;
        this.nbr = nbr;
        this.section = section;
        this.classNum = classNum;
        this.nbr = nbr;
        this.course = course;
        this.title = title;
        this.component = component;
        this.units = units;
        this.topics = topics;
    }

public void print(){
     System.out.print(subject+"\n"+
            catalog+"\n"+
            nbr+"\n"+
            section+"\n"+
            classNum+"\n"+
            course+"\n"+
            title+"\n"+
            component+"\n"+
            units+"\n"+
            topics);
    
}

}
