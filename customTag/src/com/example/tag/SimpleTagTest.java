package com.example.tag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import javax.servlet.jsp.JspException;

public class SimpleTagTest extends SimpleTagSupport {
    public void doTag() throws JspException,IOException{
        getJspContext().getOut().print("This is the lamest use of a custom tag");
    }
}
