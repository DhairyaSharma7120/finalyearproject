/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2020-12-10 17:11:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, shrink-to-fit=no\" name=\"viewport\">\r\n");
      out.write("  <title>House Mart</title>\r\n");
      out.write("  <!-- General CSS Files -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"adminResources/css/app.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"adminResources/css/selectric.css\">\r\n");
      out.write("  <!-- Template CSS -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"adminResources/css/style.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"adminResources/css/components.css\">\r\n");
      out.write("  <!-- Custom style CSS -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"adminResources/css/custom.css\">\r\n");
      out.write("  <link rel='shortcut icon' type='image/x-icon' href='adminResources/image/favicon.ico' />\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css2?family=Montserrat&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./adminResources/css/register.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"loader\"></div>\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\r\n");
      out.write("  <div id=\"app\">\r\n");
      out.write("    <section class=\"section\">\r\n");
      out.write("      <div class=\"container mt-5\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-12 col-sm-10 offset-sm-1 col-md-8 offset-md-2 col-lg-8 offset-lg-2 col-xl-8 offset-xl-2\">\r\n");
      out.write("            <div class=\"card card-primary\">\r\n");
      out.write("              <div class=\"card-header\">\r\n");
      out.write("                <h4 class=\"header\">REGISTER</h4>\r\n");
      out.write("              </div>\r\n");
      out.write("              ");
      out.write("\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <form method=\"POST\" action=\"./registerdb.jsp\">\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"form-group col-6\">\r\n");
      out.write("                      <label for=\"frist_name\">First Name</label>\r\n");
      out.write("                      <input id=\"frist_name\" type=\"text\" class=\"form-control\" name=\"first_name\" autofocus required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group col-6\">\r\n");
      out.write("                      <label for=\"last_name\">Last Name</label>\r\n");
      out.write("                      <input id=\"last_name\" type=\"text\" class=\"form-control\" name=\"last_name\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"email\">Email</label>\r\n");
      out.write("                    <input id=\"email\" type=\"email\" class=\"form-control\" name=\"email\" required>\r\n");
      out.write("                    <div class=\"invalid-feedback\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"phoneno\">Mobile Number</label>\r\n");
      out.write("                    <input id=\"phoneno\" type=\"number\" class=\"form-control\" name=\"phoneno\" required>\r\n");
      out.write("                    <div class=\"invalid-feedback\">\r\n");
      out.write("                    </div></div>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"form-group col-6\">\r\n");
      out.write("                      <label for=\"password\" class=\"d-block\">Password</label>\r\n");
      out.write("                      <input id=\"password\" type=\"password\" class=\"form-control pwstrength\" data-indicator=\"pwindicator\"\r\n");
      out.write("                        name=\"password\" required>\r\n");
      out.write("                      <div id=\"pwindicator\" class=\"pwindicator\">\r\n");
      out.write("                        <div class=\"bar\"></div>\r\n");
      out.write("                        <div class=\"label\"></div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group col-6\">\r\n");
      out.write("                      <label for=\"password2\" class=\"d-block\" >Password Confirmation</label>\r\n");
      out.write("                      <input id=\"password2\" type=\"password\" class=\"form-control\" name=\"password-confirm\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                      <input type=\"checkbox\" name=\"agree\" class=\"custom-control-input\" id=\"agree\">\r\n");
      out.write("                      <label class=\"custom-control-label\" for=\"agree\">I agree with the terms and conditions</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <button id=\"submit-btn\"  type=\"Submit\" class=\"btn btn-primary btn-lg btn-block\">\r\n");
      out.write("                      Register\r\n");
      out.write("                    </button>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"mb-4 text-muted text-center\">\r\n");
      out.write("                Already Registered? <a href=\"login.jsp\">Login</a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("  </div>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  const check = function() {\r\n");
      out.write("\t  document.getElementById(\"submit-btn\").addEventListener(\"click\", function(event){\r\n");
      out.write("\t\t  event.preventDefault()\r\n");
      out.write("\t\t});\r\n");
      out.write("\t  console.log(document.getElementById('password').value);\r\n");
      out.write("\t  console.log(document.getElementById('password2').value);\r\n");
      out.write("\t  if (document.getElementById('password').value ==\r\n");
      out.write("\t    document.getElementById('password2').value) {\r\n");
      out.write("\t    $(this).trigger(e.type);\r\n");
      out.write("\t  } else {\r\n");
      out.write("\t   alert(\"Password is not matching\");\r\n");
      out.write("\t  }\r\n");
      out.write("\t}\r\n");
      out.write("  </script>\r\n");
      out.write("  <!-- General JS Scripts -->\r\n");
      out.write("  <script src=\"adminResources/js/app.min.js\"></script>\r\n");
      out.write("  <!-- JS Libraies -->\r\n");
      out.write("  <script src=\"adminResources/js/jquery.pwstrength.min.js\"></script>\r\n");
      out.write("  <script src=\"adminResources/js/jquery.selectric.min.js\"></script>\r\n");
      out.write("  <!-- Page Specific JS File -->\r\n");
      out.write("  <script src=\"adminResources/js/auth-register.js\"></script>\r\n");
      out.write("  <!-- Template JS File -->\r\n");
      out.write("  <script src=\"adminResources/js/scripts.js\"></script>\r\n");
      out.write("  <!-- Custom JS File -->\r\n");
      out.write("  <script src=\"adminResources/js/custom.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
