package com.example.web;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.zip.GZIPOutputStream;

public class CompressionResponseWrapper extends HttpServletResponseWrapper {
    private GZIPServletOutputStream  servletGzipOs = null;
    private PrintWriter pw = null;

    CompressionResponseWrapper(HttpServletResponse response) {
        super(response);
    }

    public void setContentLength(int len) {}

    public GZIPOutputStream getGZIPOutputStream() {
        return this.servletGzipOs.internalGzipOS;
    }

    private Object streamUsed = null;

    public ServletOutputStream getOutputStream() throws IOException {
        if ((streamUsed != null) && (streamUsed != pw)) {
            throw new IllegalStateException();
        }
        if (servletGzipOs == null) {
            servletGzipOs
                = new GZIPServletOutputStream(getResponse()
                                              .getOutputStream());
            streamUsed = servletGzipOs;
        }
        return servletGzipOs;
    }

    public PrintWriter getWriter() throws IOException {
        if ((streamUsed != null) && (streamUsed != servletGzipOs)) {
            throw new IllegalStateException();
        }
        if (pw == null) {
            servletGzipOs
                = new GZIPServletOutputStream(getResponse()
                                              .getOutputStream());

            OutputStreamWriter osw
                = new OutputStreamWriter(servletGzipOs,
                                         getResponse().getCharacterEncoding());
            pw = new PrintWriter(osw);
            streamUsed = pw;
        }
        return pw;
    }
}
