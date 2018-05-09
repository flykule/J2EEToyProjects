package com.example.web;

import javax.servlet.http.*;
import javax.servlet.*;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class GZIPServletOutputStream extends ServletOutputStream {
    GZIPOutputStream internalGzipOS;

    /** Decorator constructor*/
    GZIPServletOutputStream(ServletOutputStream sos) throws IOException {
        this.internalGzipOS = new GZIPOutputStream(sos);
    }

    public void write(int param) throws IOException {
        internalGzipOS.write(param);
    }

    public void setWriteListener(WriteListener writeListener) { }

    public boolean isReady() { return true;}
}
