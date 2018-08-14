package com.uom.test;


	import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	public class checkBox extends HttpServlet // to extend the class as a servlet
	{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
		
			String maths = req.getParameter("maths");
			String physics = req.getParameter("physics");
			String chemistry = req.getParameter("chemistry");
			
			System.out.println("Maths: " +maths);
			System.out.println("Physics: " +physics);
			System.out.println("Chemistry: " +chemistry);
			
			ArrayList<String> myList = new ArrayList<String>();
			
			if(maths != null){
				myList.add("Maths");
			}

			if(physics != null){
				myList.add("Physics");
			}

			if(chemistry != null){
				myList.add("Chemistry");
			}
			
			req.setAttribute("myList", myList);
			req.getRequestDispatcher("myData.jsp").forward(req, resp);
			}
		
			
		}

