package com.example.tag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import javax.servlet.jsp.JspException;

public class SimpleTagTest2 extends SimpleTagSupport {
    public void doTag() throws JspException,IOException{
        getJspContext().setAttribute("message","Wear sunscreen");
        getJspBody().invoke(null);
    }
}
