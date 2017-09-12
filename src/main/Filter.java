package main;

import java.util.ArrayList;


/**
 * Created by Home on 9/12/2017.
 */
public class Filter {
    ArrayList<Course> list = new ArrayList<>();
    Course course = new Course();
    String text1="", text2="";

    public void check(String text){


        if(course.getSubject()==""){
            if(org.apache.commons.lang3.StringUtils.isAllUpperCase(text1) && text1.length()==3 && text1!="LDS")
                course.setSubject(text1);
        else{

            }

    }
}
