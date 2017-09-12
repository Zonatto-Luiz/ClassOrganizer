package main;

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
/*
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
    }*/

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getNbr() {
        return nbr;
    }

    public void setNbr(String nbr) {
        this.nbr = nbr;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
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
