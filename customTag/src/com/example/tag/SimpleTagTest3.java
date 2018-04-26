package com.example.tag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import javax.servlet.jsp.JspException;

/**
 * how to iterating body
 **/
public class SimpleTagTest3 extends SimpleTagSupport {
    String[] movies = {"Monsoon Wedding","Saved","Fahrenheit 9/11"};

    public void doTag() throws JspException,IOException{
        for (int i = 0; i < movies.length; i++) {
            getJspContext().setAttribute("movie",movies[i]);
            getJspBody().invoke(null);
        }
    }
}
