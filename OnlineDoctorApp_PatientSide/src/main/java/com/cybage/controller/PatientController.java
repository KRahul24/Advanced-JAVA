package com.cybage.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.dao.PatientDaoImple;
import com.cybage.model.Patient;

@WebServlet("/")
public class PatientController extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    private PatientDaoImple patientDaoImple;

    public void init()
    {
    	patientDaoImple= new PatientDaoImple();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        String action = request.getServletPath();

        try
        {
            switch (action)
            {
                case "/patientLogin":
                    patientLogin(request, response);
                    break;
                case "/patientRegister":
                    insertPatient(request, response);
                    break;
//                case "/delete":
//                    deleteUser(request, response);
//                    break;
//                case "/edit":
//                    showEditForm(request, response);
//                    break;
//                case "/update":
//                    updateUser(request, response);
//                    break;
//                default:
//                    listUser(request, response);
//                    break;
            }
        } catch (SQLException ex)
        {
            throw new ServletException(ex);
        }
    }

	private void insertPatient(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
	    String pName=request.getParameter("pName");
	    int pAge=Integer.parseInt(request.getParameter("pAge"));
	    String gender=request.getParameter("gender");
	    String pContact=(String)request.getParameter("pContact");
	    String pEmail=request.getParameter("pEmail");
	    String pAddress=request.getParameter("pAddress");
	    String pDisease=request.getParameter("pDisease");
	    String roomType=request.getParameter("roomType");
	    String pPassword=request.getParameter("pPassword");
	    
	    Patient newPatient = new Patient();
        newPatient.setpPass(pPassword);
        newPatient.setpName(pName);
        newPatient.setAge(30);
        newPatient.setGender(gender);
        newPatient.setContact(pContact);
        newPatient.setpEmail(pEmail);
        newPatient.setAddress(pAddress);
        newPatient.setDisease(pDisease);
        newPatient.setRoomType(roomType);
        java.sql.Date regDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        newPatient.setRegDate(regDate);
	    
	    //logger.info((pName + " "+pAge +" "+ gender +" "+pPassword+" "+pContact+" "+pEmail+" "+pAddress+" "+date+" "+pDisease+" "+roomType));
	    patientDaoImple.registerPatient(newPatient);
	    response.sendRedirect("patientLogin.jsp");
	    
	}
    
	private void patientLogin(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
        String pEmail = request.getParameter("pEmail");
        String pPassword = request.getParameter("pPassword");
     
        Patient currPatient=new Patient();
        currPatient=patientDaoImple.patientLogin(pEmail,pPassword);
        
        if(currPatient!=null)
        {
        	HttpSession session=request.getSession();
        	session.setAttribute("patientName", currPatient.getpName());
        	response.sendRedirect("patientHomePage.jsp");
        }
        else
        {
//        	String s=new String();
//        	s="Wrong credentials, Enter again!";
//        	request.setAttribute("errorMessage", s);
        	HttpSession session=request.getSession();
        	session.setAttribute("errorMessage","Wrong credentials, Enter again!");
        	response.sendRedirect("patientLogin.jsp");
        }
		
	}
}
