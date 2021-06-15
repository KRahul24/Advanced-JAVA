package com.cybage.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.IOUtils;

import com.cybage.dao.MaterialDao;
import com.cybage.model.AddMaterial;
import com.mysql.cj.jdbc.Blob;

import sun.nio.ch.IOUtil;


@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215) // upload file's size up to 16MB
public class MaterialServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    private MaterialDao materialDao;

    @Override
    public void init() {
        materialDao = new MaterialDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        // gets values of text fields
        String category = request.getParameter("category");
        //String lastName = request.getParameter("lastName");

        InputStream inputStream = null; // input stream of the upload file

        String message = null;
        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("material");
        
        if (filePart != null) 
        {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }

//        InputStreamReader isReader=new InputStreamReader(inputStream);
//        BufferedReader reader=new BufferedReader(isReader);
//        StringBuffer sb=new StringBuffer();
//        String str;
//        while((str=reader.readLine())!=null)
//        {
//        	sb.append(str);
//        }
//        System.out.println(str+"   hellooooooooooooooooooooooooooooooo");
        
        byte[] byteContent=org.apache.commons.io.IOUtils.toByteArray(inputStream);
        Blob blob=new Blob(byteContent, null);
        AddMaterial newMaterial=new AddMaterial();
        
        newMaterial.setCategory(category);
        newMaterial.setMaterial(blob);
        //newMaterial.setMaterial(str);
        
        // sends the statement to the database server
        materialDao.insertMaterial(newMaterial);

        // sets the message in request scope
        request.setAttribute("Message", message);

        // forwards to the message page
        getServletContext().getRequestDispatcher("/message.jsp")
            .forward(request, response);
    }
}