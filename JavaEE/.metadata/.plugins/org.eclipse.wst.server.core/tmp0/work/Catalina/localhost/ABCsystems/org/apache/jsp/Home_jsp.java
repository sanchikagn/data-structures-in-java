/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-07-07 16:43:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write(".container{\r\n");
      out.write("padding: 80px 120px;\r\n");
      out.write("}\r\n");
      out.write(".cas {\r\n");
      out.write("      background: #000d1a;\r\n");
      out.write("      color: #bdbdbd;\r\n");
      out.write("  }\r\n");
      out.write("  .cas h3 {color:#5c8a8a;}\r\n");
      out.write("  .carousel-inner img {\r\n");
      out.write("     \r\n");
      out.write("      width: 100%; /* Set width to 100% */\r\n");
      out.write("      margin: auto;\r\n");
      out.write("  }\r\n");
      out.write("  .btn{\r\n");
      out.write("     background-color:#000d1a;\r\n");
      out.write("}\r\n");
      out.write(".navbar {\r\n");
      out.write("      background-color:#000d1a;\r\n");
      out.write("      border: 0;\r\n");
      out.write("      font-size: 11px;\r\n");
      out.write("      letter-spacing: 4px;\r\n");
      out.write("      opacity: 0.9;\r\n");
      out.write("  }\r\n");
      out.write("  .navbar li a, .navbar .navbar-brand {\r\n");
      out.write("      color: #d5d5d5 ;\r\n");
      out.write("  }\r\n");
      out.write("  .navbar-nav li a:hover {\r\n");
      out.write(" background-color:white;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("  <title>ABC</title>\r\n");
      out.write("  \r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar navbar-fixed-top\" data-spy=\"scroll\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("       <a class=\"navbar-brand\" href=\"#\" >ABC</a>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li><a href=\"#about\">HOME</a></li>\r\n");
      out.write("        <li><a href=\"#services\">SERVICES</a></li>\r\n");
      out.write("        <li><a href=\"#contact\">CONTACT</a></li>\r\n");
      out.write("        \r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("    <ol class=\"carousel-indicators\">\r\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("    </ol>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("      <div class=\"item active\">\r\n");
      out.write("        <img src=\"img/phone.jpg\" alt=\"phone\" width=\"1200\" height=\"700\">\r\n");
      out.write("        <div class=\"carousel-caption\">\r\n");
      out.write("          <h3>Online-shopping</h3>\r\n");
      out.write("\t\t  <hr>\r\n");
      out.write("          <p>Do your shopping online!Find out various electronic components.Different technologies,prices,offers for all our customers.Let's learn more on Tronic Mart</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"item\">\r\n");
      out.write("        <img src=\"img/Laptop.jpg\" alt=\"Laptop\" width=\"1200\" height=\"700\">\r\n");
      out.write("        <div class=\"carousel-caption\">\r\n");
      out.write("          <h3>Delivery</h3>\r\n");
      out.write("\t\t  <hr>\r\n");
      out.write("          <p>We delivery to your doorstep</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("      <div class=\"item\">\r\n");
      out.write("        <img src=\"img/3.jpg\" alt=\"Camera\" width=\"1200\" height=\"700\">\r\n");
      out.write("        <div class=\"carousel-caption\">\r\n");
      out.write("          <h3>Offers</h3>\r\n");
      out.write("\t\t  <hr>\r\n");
      out.write("          <p>We have marvellous offers for our customers</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Left and right controls -->\r\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\"  data-slide=\"prev\">\r\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\" ></span>\r\n");
      out.write("      <span class=\"sr-only\">Previous</span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\r\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("      <span class=\"sr-only\">Next</span>\r\n");
      out.write("    </a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container text-center\" id=\"about\">\r\n");
      out.write("  <h3><b>ABC</b></h3>\r\n");
      out.write("  <p><b>Co-create products with our customers</b></p>\r\n");
      out.write("  <p><b>VALUE - DELIVERY - POWER - CARE</b></p>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"tour\" class=\"cas\">\r\n");
      out.write(" \r\n");
      out.write("  <div class=\"container\" id=\"services\">\r\n");
      out.write("    <div class=\"row text-center\">\r\n");
      out.write("\t <h3>Explore varieties of electronic appliances!!</h3>\r\n");
      out.write("      <div class=\"col-sm-4\">\r\n");
      out.write("        <div class=\"thumbnail\">\r\n");
      out.write("          <img src=\"img/Laptop.jpg\" alt=\"Laptop\" width=\"400\" height=\"300\">\r\n");
      out.write("         <p><strong>Computers & Laptop</strong></p>\r\n");
      out.write("         \r\n");
      out.write("          <a href=\"lap.jsp\"> <button class=\"btn\">Find More</button></a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-sm-4\">\r\n");
      out.write("        <div class=\"thumbnail\">\r\n");
      out.write("          <img src=\"img/TV.jpg\" alt=\"TV\" width=\"400\" height=\"300\">\r\n");
      out.write("          <p><strong>TV, Audio & Surveillance</strong></p>\r\n");
      out.write("          \r\n");
      out.write("          <a href=\"tv.jsp\"><button class=\"btn\">Find More</button></a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-sm-4\">\r\n");
      out.write("        <div class=\"thumbnail\">\r\n");
      out.write("          <img src=\"img/3.jpg\" alt=\"Camera\" width=\"400\" height=\"300\">\r\n");
      out.write("          <p><strong>Cameras</strong></p>\r\n");
      out.write("        \r\n");
      out.write("          <a href=\"cam.jsp\"><button class=\"btn\">Find More</button></a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t <div class=\"row text-center\">\r\n");
      out.write("      <div class=\"col-sm-2\">\r\n");
      out.write("       \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-sm-4\">\r\n");
      out.write("        <div class=\"thumbnail\">\r\n");
      out.write("          <img src=\"img/phone.jpg\" alt=\"Phone\" width=\"400\" height=\"300\">\r\n");
      out.write("          <p><strong>Phones & Tablets</strong></p>\r\n");
      out.write("          \r\n");
      out.write("          <a href=\"phone.jsp\"><button class=\"btn\">Find More</button></a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-sm-4\">\r\n");
      out.write("        <div class=\"thumbnail\">\r\n");
      out.write("          <img src=\"img/Veh.jpg\" alt=\"Vehicle\" width=\"400\" height=\"300\">\r\n");
      out.write("          <p><strong>Vehicle Electronics and GPS</strong></p>\r\n");
      out.write("        \r\n");
      out.write("          <a href=\"vehicle.jsp\"><button class=\"btn\">Find More</button></a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\t   <div class=\"col-sm-2\">\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"container\" id=\"contact\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-sm-5\">\r\n");
      out.write("      <h2>Contact us </h2>\r\n");
      out.write("      <p><span class=\"glyphicon glyphicon-map-marker\"></span> Colombo, SriLanka</p>\r\n");
      out.write("      <p><span class=\"glyphicon glyphicon-phone\"></span> +94-11-2341541</p>\r\n");
      out.write("      <p><span class=\"glyphicon glyphicon-envelope\"></span> abccompany@hotmail.com</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-7\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-6 form-group\">\r\n");
      out.write("          <input class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Name\" type=\"text\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-6 form-group\">\r\n");
      out.write("          <input class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Email\" type=\"email\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <textarea class=\"form-control\" id=\"comments\" name=\"comments\" placeholder=\"Comment\" rows=\"5\"></textarea><br>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-12 form-group\">\r\n");
      out.write("          <button class=\"btn btn-primary pull-right\" type=\"submit\">Send</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
