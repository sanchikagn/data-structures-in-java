/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-07-07 17:02:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.abcsystems.products.Product;

public final class cam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.abcsystems.products.Product");
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

      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>ABC</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/lap1.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("    <nav id=\"mainNav\" class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand page-scroll\" href=\"Home.html\">ABC</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          \r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"phone.jsp\">Phones & Tablets</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"lap.jsp\">Laptops & Computers</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"cam.jsp\">Cameras</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"tv.jsp\">TV, Audio & Surveillance</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"vehicle.jsp\">Vehicle Electronics & GPS</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>          \r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("<br/><br/><br/><br/>\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"header-content\">\r\n");
      out.write("            <div class=\"header-content-inner\" align=\"center\">\r\n");
      out.write("                <h1>Cameras</h1>\r\n");
      out.write("\t\t\t\t<h3></h3>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <h3></h3>\r\n");
      out.write("                <a href=\"#about\" class=\"btn btn-primary btn-xl page-scroll\">Find Out More</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("<br/><br/><br/><br/>\r\n");
      out.write("    <section class=\"bg-primary\" id=\"about\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 text-center\">\r\n");
      out.write("                    <h2 class=\"section-heading\">What We've got!</h2>\r\n");
      out.write("                    <hr class=\"light\">\r\n");
      out.write("                    <p class=\"text-faded\">We have got manymore offers and previlages for our customers<br>We serves technlogy on your hand!!</p>\r\n");
      out.write("                    <br/>\r\n");
      out.write("\t\t\t\t\t<a href=\"#portfolio\" class=\"page-scroll btn btn-default btn-xl sr-button\">Get Started!</a>\r\n");
      out.write("               <br/><br/><br/>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\t<br/><br/><br/><br/><br/>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("<div class=\"thumbnail\">\r\n");
      out.write("<img src=\"images/eos rebelt6.jpg\" alt=\"\" height=\"75px\"><br/><br/><br/><br/>\r\n");
      out.write("<div class=\"caption\">\r\n");
      out.write("<h4 class=\"pull-right\">LKR 118 000</h4>\r\n");
      out.write("<h4><a href=\"#\">Canono EOS Rebel T6s</a>\r\n");
      out.write("</h4>\r\n");
      out.write("<p>\r\n");
      out.write("Digital SLR Camera Black\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ratings\">\r\n");
      out.write("<a href=\"product.jsp\" class=\"btn btn-primary\">Order Now</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("<div class=\"thumbnail\">\r\n");
      out.write("<img src=\"images/p.jpg\" alt=\"\" height=\"75px\"><br/><br/><br/><br/><br/><br/><br/><br/>\r\n");
      out.write("<div class=\"caption\">\r\n");
      out.write("<h4 class=\"pull-right\">LKR 285 000</h4>\r\n");
      out.write("<h4><a href=\"#\">Nikon D810 Digital </a>\r\n");
      out.write("</h4>\r\n");
      out.write("<p>\r\n");
      out.write("Digital SLR Camera Balck\r\n");
      out.write("</p><br/>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ratings\">\r\n");
      out.write("<a href=\"product.jsp\" class=\"btn btn-primary\">Order Now</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("<div class=\"thumbnail\">\r\n");
      out.write("<img src=\"images/s-l500.jpg\" alt=\"\"><br/><br/><br/><br/>\r\n");
      out.write("<div class=\"caption\">\r\n");
      out.write("<h4 class=\"pull-right\">LKR 168 000</h4>\r\n");
      out.write("<h4><a href=\"#\">Canon EOS 80D</a>\r\n");
      out.write("</h4>\r\n");
      out.write("<p>\r\n");
      out.write("Digital SLR Camera\r\n");
      out.write("</p><br/>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ratings\">\r\n");
      out.write("<a href=\"product.jsp\" class=\"btn btn-primary\">Order Now</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div><br/>\r\n");
      out.write("<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("<div class=\"thumbnail\">\r\n");
      out.write("<img src=\"images/lens.jpg\" alt=\"\"><br/><br/><br/><br/>\r\n");
      out.write("<div class=\"caption\">\r\n");
      out.write("<h4 class=\"pull-right\">LKR 7 500</h4>\r\n");
      out.write("<h4><a href=\"#\">Nikon 35mm f/1.8G AF-S DX lens</a>\r\n");
      out.write("</h4>\r\n");
      out.write("<p>\r\n");
      out.write("For Nikon digital SLR camera\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ratings\">\r\n");
      out.write("<a href=\"product.jsp\" class=\"btn btn-primary\">Order Now</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("<div class=\"thumbnail\">\r\n");
      out.write("<img src=\"images/s-l1600.jpg\" alt=\"\"><br/><br/><br/>\r\n");
      out.write("<div class=\"caption\">\r\n");
      out.write("<h4 class=\"pull-right\">LKR 114 400</h4>\r\n");
      out.write("<h4><a href=\"#\">Fujifilm X-A2</a>\r\n");
      out.write("</h4>\r\n");
      out.write("<p>\r\n");
      out.write("Mirrorless, 16-50 & 50-230 lenses, brown\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ratings\">\r\n");
      out.write("<a href=\"product.jsp\" class=\"btn btn-primary\">Order Now</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("<div class=\"thumbnail\">\r\n");
      out.write("<img src=\"images/lens1.jpg\" alt=\"\">\r\n");
      out.write("<div class=\"caption\">\r\n");
      out.write("<h4 class=\"pull-right\">LKR 9 500</h4>\r\n");
      out.write("<h4><a href=\"#\">Ultra Photo 8mm 3.5 HD/f</a>\r\n");
      out.write("</h4>\r\n");
      out.write("<p>\r\n");
      out.write("Ultra wide angle fisheye for Canon DSLR camer\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ratings\">\r\n");
      out.write("<a href=\"product.jsp\" class=\"btn btn-primary\">Order Now</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <aside class=\"bg-dark\">\r\n");
      out.write("        <div class=\"container text-center\">\r\n");
      out.write("            <div class=\"call-to-action\">\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </aside>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"contact\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 text-center\">\r\n");
      out.write("                    <h2 class=\"section-heading\">Get In Touch With Us!</h2>\r\n");
      out.write("                    <hr class=\"primary\">\r\n");
      out.write("                    <p>Start Your transaction with us?<br> Great! Contact us via phone or mail us!</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-lg-offset-2 text-center\">\r\n");
      out.write("                    <i class=\"fa fa-phone fa-3x sr-contact\"></i>\r\n");
      out.write("                    <p>+94-11-2571871</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 text-center\">\r\n");
      out.write("                    <i class=\"fa fa-envelope-o fa-3x sr-contact\"></i>\r\n");
      out.write("                    <p><a href=\"#\">abccompany@gmail.com</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Plugin JavaScript -->\r\n");
      out.write("    <script src=\"js/scrollreveal.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.easing.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.fittext.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Theme JavaScript -->\r\n");
      out.write("    <script src=\"js/creative.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
