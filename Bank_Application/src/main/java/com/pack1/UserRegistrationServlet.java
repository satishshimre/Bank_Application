package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class UserRegistrationServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		UserBean bean=new UserBean();
		
		bean.setU_fname(req.getParameter("fname"));
		bean.setU_name(req.getParameter("uname"));
		bean.setU_mail(req.getParameter("umail"));
		bean.setU_phone(req.getParameter("uphone"));
		bean.setU_accno(req.getParameter("accno"));
		bean.setU_pwd(req.getParameter("upwd"));
		
		UserRegistrationDAO dao_obj=new UserRegistrationDAO();
		int rowCount=dao_obj.insert_NewUserRecord(bean);
		if(rowCount==0)
		{
			
		}
		else
		{
			req.setAttribute("msg", "Record Inserted Successfully!!!");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		}
	}
}
