package com.abcsystems.products;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Products")
public class ProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Product> products = new ArrayList<Product>();
		Product p1 = new Product();
		p1.setId(0001);
		p1.setName("Samsung Galaxy S7");
		p1.setPrice(240);
		p1.setDescription("New Samsung Galaxy S7 SM-G930FD Duos 5.1'' 12MP");
		p1.setImage("product2.jpg");
		Product p2 = new Product();
		p1.setId(0002);
		p2.setName("Apple iPhone 5C");
		p2.setPrice(150);
		p2.setDescription("Original Apple iPhone 5C A1456 32GB/16GB/8G");
		p2.setImage("product3.jpg");
		products.add(p1);
		products.add(p2);
		request.setAttribute("products", products);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
