/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2021-02-24 06:27:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<link rel=\"stylesheet\" href=\"./adminResources/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./adminResources/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("<div class=\"main-sidebar sidebar-style-2\">\r\n");
      out.write("\t<aside id=\"sidebar-wrapper\">\r\n");
      out.write("\t\t<div class=\"sidebar-brand\">\r\n");
      out.write("\t\t\t<a href=\"./index.jsp\">\r\n");
      out.write("\t\t\t<!--   <img alt=\"image\" src=\"adminResources/image/logo.png\" class=\"header-logo\" /> --> \r\n");
      out.write("\t\t\t<span class=\"logo-name\" >House Mart</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<ul class=\"sidebar-menu\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a href=\"./index.jsp\"\r\n");
      out.write("\t\t\t\tclass=\"nav-link\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i><span>Home</span></a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a href=\"./viewUsers.jsp\"\r\n");
      out.write("\t\t\t\tclass=\"nav-link\"><i class=\"fa fa-users\" aria-hidden=\"true\"></i><span>Manage Users</span></a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a href=\"#\"\r\n");
      out.write("\t\t\t\tclass=\"menu-toggle nav-link has-dropdown\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-cube\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t<span>Manage Categories</span></a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"addCategory.jsp\">Add Category</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"viewCategory.jsp\">View Category</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a href=\"#\"\r\n");
      out.write("\t\t\t\tclass=\"menu-toggle nav-link has-dropdown\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-cubes\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t<span>Manage Subcategories</span></a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"addSubCategory.jsp\">Add Subcategories</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"viewSubCategory.jsp\">View Subcategories</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a href=\"#\"\r\n");
      out.write("\t\t\t\tclass=\"menu-toggle nav-link has-dropdown\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-map\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t<span>Manage State </span></a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"addState.jsp\">Add State</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"viewState.jsp\">View State</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\"\r\n");
      out.write("\t\t\t\tclass=\"menu-toggle nav-link has-dropdown\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t<span>Manage City </span></a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"addCity.jsp\">Add City</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"viewCity.jsp\">View City</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\"\r\n");
      out.write("\t\t\t\tclass=\"menu-toggle nav-link has-dropdown\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-map-pin\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t<span>Manage Area </span></a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"addArea.jsp\">Add Area</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"viewArea.jsp\">View Area</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a href=\"#\"\r\n");
      out.write("\t\t\t\tclass=\"menu-toggle nav-link has-dropdown\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-university\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t<span>Manage Property</span></a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"addProperty.jsp\">Add Property</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"viewProperty.jsp\">View Property</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\"\r\n");
      out.write("\t\t\t\tclass=\"menu-toggle nav-link has-dropdown\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-gavel\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t<span>Manage Construction Status </span></a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"addConstructionStatus.jsp\">Add Construction Status</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"nav-link\" href=\"viewConstructionStatus.jsp\">View Construction Status</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"viewComplains.jsp\"\r\n");
      out.write("\t\t\t\tclass=\"nav-link\"><i class=\"fa fa-comments\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>Manage Complains</span></a>\r\n");
      out.write("\t\t\t</li>  \r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a href=\"viewFeedback.jsp\"\r\n");
      out.write("\t\t\t\tclass=\"nav-link\"><i class=\"fa fa-thumbs-up\" aria-hidden=\"true\"></i><span>Manage Feedbacks</span></a>\r\n");
      out.write("\t\t\t</li>  \t\t\t\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a href=\"./index.jsp\"\r\n");
      out.write("\t\t\t\tclass=\"nav-link\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i><span>Logout</span></a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\r\n");
      out.write("\t</aside>\r\n");
      out.write("</div>\r\n");
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
