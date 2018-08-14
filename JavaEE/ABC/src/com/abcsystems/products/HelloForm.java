package com.abcsystems.products;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		System.out.println(request.getParameter("fName"));
		System.out.println(request.getParameter("phnNum"));
		
		request.setAttribute("username",request.getParameter("fName"));
		 request.setAttribute("userphoneno",request.getParameter("phnNum"));
		request.getRequestDispatcher("success.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
