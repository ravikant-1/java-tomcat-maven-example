/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2018-10-16 09:52:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"icon\" href=\"../../../../favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("    <title>Reliance </title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\"></link>\r\n");
      out.write("   \r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"\" rel=\"stylesheet\">\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\r\n");
      out.write("\t.banner-nissan {\r\n");
      out.write("\t  height: 600px;\r\n");
      out.write("\t  width: 100%;\r\n");
      out.write("\t \r\n");
      out.write("\t  max-width: 100%;\r\n");
      out.write("\t  min-height: 20%;\r\n");
      out.write("\t  min-width: 30%;\r\n");
      out.write("\t  background-image: url(\"Jio-Innovative-company.jpg\");\r\n");
      out.write("\tbackground-size: contain;\r\n");
      out.write("\tbackground-repeat:no-repeat;\r\n");
      out.write("\t}\r\n");
      out.write("\t.banner-simpli {\r\n");
      out.write("\t  height: 400px;\r\n");
      out.write("\t  width: 100%;\r\n");
      out.write("\t  max-height: 100%;\r\n");
      out.write("\t  max-width: 100%;\r\n");
      out.write("\t  background-image: url(\"simplilearn.png\");\r\n");
      out.write("\t  background-size: cover;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</style>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("      <div class=\"collapse bg-dark\" id=\"navbarHeader\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-8 col-md-7 py-4\">\r\n");
      out.write("              <h4 class=\"text-white\">About</h4>\r\n");
      out.write("              <p class=\"text-muted\">Add some information about the album below, the author, or any other background context. Make it a few sentences long so folks can pick up some informative tidbits. Then, link them off to some social networking sites or contact information.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-4 offset-md-1 py-4\">\r\n");
      out.write("              <h4 class=\"text-white\">Contact</h4>\r\n");
      out.write("              <ul class=\"list-unstyled\">\r\n");
      out.write("                <li><a href=\"#\" class=\"text-white\">Follow on Twitter</a></li>\r\n");
      out.write("                <li><a href=\"#\" class=\"text-white\">Like on Facebook</a></li>\r\n");
      out.write("                <li><a href=\"#\" class=\"text-white\">Email me</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"navbar navbar-dark bg-dark box-shadow\" style=\" background-color:#f2f2f2!important;\">\r\n");
      out.write("        <div class=\"container d-flex justify-content-between\">\r\n");
      out.write("          <a href=\"#\" class=\"navbar-brand d-flex align-items-center\">\r\n");
      out.write("\t\t\t<img src=\"RIL_Logo.png\">\r\n");
      out.write("\t\t  \r\n");
      out.write("          </a>\r\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarHeader\" aria-controls=\"navbarHeader\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <main role=\"main\">\r\n");
      out.write("\r\n");
      out.write("      <section class=\"jumbotron text-center\">\r\n");
      out.write("        <div class=\"container banner-nissan\" >\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("      <div class=\"album py-5 bg-light\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("              <div class=\"card mb-4 box-shadow\">\r\n");
      out.write("                <img class=\"card-img-top\" src=\"thumbnail.svg\" alt=\"Card image cap\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                  <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                    <div class=\"btn-group\">\r\n");
      out.write("                      <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                      <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <small class=\"text-muted\">9 mins</small>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("              <div class=\"card mb-4 box-shadow\">\r\n");
      out.write("                <img class=\"card-img-top\" src=\"thumbnail.svg\" alt=\"Card image cap\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                  <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                    <div class=\"btn-group\">\r\n");
      out.write("                      <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                      <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <small class=\"text-muted\">9 mins</small>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("              <div class=\"card mb-4 box-shadow\">\r\n");
      out.write("               <img class=\"card-img-top\" src=\"thumbnail.svg\" alt=\"Card image cap\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                  <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                    <div class=\"btn-group\">\r\n");
      out.write("                      <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                      <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <small class=\"text-muted\">9 mins</small>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t   <div class=\"navbar navbar-dark bg-dark box-shadow\">\r\n");
      out.write("        <div class=\"container d-flex justify-content-between\">\r\n");
      out.write("          <a href=\"#\" class=\"navbar-brand d-flex align-items-center\">\r\n");
      out.write("            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"mr-2\"><path d=\"M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z\"></path><circle cx=\"12\" cy=\"13\" r=\"4\"></circle></svg>\r\n");
      out.write("            <strong>Simplilearn</strong>\r\n");
      out.write("          </a>\r\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarHeader\" aria-controls=\"navbarHeader\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t <div class=\"album py-5 bg-light\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<section class=\"jumbotron text-center col-lg-12\">\r\n");
      out.write("\t\t\t<div class=\"container banner-simpli\">\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t <div class=\"container\">\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t\t<div class=\"row text-center\"><h1>Helping professionals thrive, not just survive</h1></div>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("              <div class=\"card mb-4 box-shadow\">\r\n");
      out.write("                <img class=\"card-img-top\" src=\"thumbnail.svg\" alt=\"Card image cap\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <p class=\"card-text\">Learning Ã¢ÂÂ Blended to Perfection</p>\r\n");
      out.write("                  <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                    <div class=\"btn-group\">\r\n");
      out.write("                      <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                      <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("              <div class=\"card mb-4 box-shadow\">\r\n");
      out.write("                <img class=\"card-img-top\" src=\"thumbnail.svg\" alt=\"Card image cap\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <p class=\"card-text\">Validated & Certified</p>\r\n");
      out.write("                  <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                    <div class=\"btn-group\">\r\n");
      out.write("                      <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                      <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("              <div class=\"card mb-4 box-shadow\">\r\n");
      out.write("               <img class=\"card-img-top\" src=\"thumbnail.svg\" alt=\"Card image cap\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <p class=\"card-text\">Achieve Your Dreams</p>\r\n");
      out.write("                  <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                    <div class=\"btn-group\">\r\n");
      out.write("                      <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                      <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("       \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("    <footer class=\"text-muted\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <p class=\"float-right\">\r\n");
      out.write("          <a href=\"#\">Back to top</a>\r\n");
      out.write("        </p>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core JavaScript\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery-slim.min.js\"><\\/script>')</script>\r\n");
      out.write("    \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
