package com.abcsystems.products;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Products")
public class productsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Product> products = new ArrayList<Product>();
		Product p1 = new Product();
		p1.setId(0001);
		p1.setName("Samsung Galaxy S7");
		p1.setPrice(108000);
		p1.setDescription("New Samsung Galaxy S7 SM-G930FD Duos 5.1'' 12MP (FACTORY UNLOCKED) - 32GB - 4G LTE - dust proof and water resistant over 1.5 meter ");
		p1.setImage("s7e.jpg");
		
		Product p2 = new Product();
		p1.setId(0002);
		p2.setName("Samsung Galaxy Note 4 7.0");
		p2.setPrice(65000);
		p2.setDescription("SM-N910T 32GB Factory Unlocked 4G");
		p2.setImage("note4.jpg");
		
		Product p3 = new Product();
		p3.setId(0003);
		p3.setName("Sony Xperia Z5 Premium");
		p3.setPrice(77000);
		p3.setDescription("23 MP, f/2.0 24mm, phase detection, autofocus, LED flash");
		p3.setImage("z5.jpg");
		
		Product p4 = new Product();
		p4.setId(0004);
		p4.setName("HTC 10");
		p4.setPrice(94000);
		p4.setDescription("32GB, factory unlocked,1/2.3'' sensor size, 1.55µm pixel size, geo-tagging, touch focus, face detection, HDR, panorama");
		p4.setImage("htc10.jpg");
		
		Product p5 = new Product();
		p5.setId(0005);
		p5.setName("Huawei P9");
		p5.setPrice(72500);
		p5.setDescription("5.20-inch touchscreen display, 1.8GHz octa-core processor, 32GB, 4G");
		p5.setImage("p93.jpg");
		
		Product p6 = new Product();
		p6.setId(0006);
		p6.setName("New Apple Watch");
		p6.setPrice(4500);
		p6.setDescription("Stock Brand New Apple Watch 38mm Stainless Steel Case with Milanese Loop");
		p6.setImage("product6.jpg");
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		request.setAttribute("products", products);
		request.getRequestDispatcher("phone.jsp").forward(request, response);
	}
}