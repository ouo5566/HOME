/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2018-08-05 06:14:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head_002dfunction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${js}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app.js\"></script>\n");
      out.write("\n");
      out.write("<!-- <script>\n");
      out.write("\t/* anonymous function */\n");
      out.write("\tvar common = new (function(){\n");
      out.write("\t\tthis.move = function (domain, action, page){\n");
      out.write("\t\t\tlocation.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\"+domain+\".do?action=\"+action+\"&page=\"+page;\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\tvar member = new (function(){\n");
      out.write("\t\tvar memberId, password, ssn, name;\n");
      out.write("\t\tthis.setMemberId = function(x){\n");
      out.write("\t\t\tthis.memberId = x;\n");
      out.write("\t\t}\n");
      out.write("\t\tthis.setSsn = function(x){\n");
      out.write("\t\t\tthis.ssn = x;\n");
      out.write("\t\t}\n");
      out.write("\t\tthis.setPassword = function(x){\n");
      out.write("\t\t\tthis.password = x;\n");
      out.write("\t\t}\n");
      out.write("\t\tthis.setName = function(x){\n");
      out.write("\t\t\tthis.name = x;\n");
      out.write("\t\t}\n");
      out.write("\t\tthis.getMemberId = function(){\n");
      out.write("\t\t\treturn this.memberId;\n");
      out.write("\t\t}\n");
      out.write("\t\tthis.getSsn = function(){\n");
      out.write("\t\t\treturn this.ssn;\n");
      out.write("\t\t}\n");
      out.write("\t\tthis.getPassword = function(){\n");
      out.write("\t\t\treturn this.password;\n");
      out.write("\t\t}\n");
      out.write("\t\tthis.getName = function(){\n");
      out.write("\t\t\treturn this.name;\n");
      out.write("\t\t}\n");
      out.write("\t\tthis.loginValidation = function(){\n");
      out.write("\t\t\tif(this.memberId === \"\"){\n");
      out.write("\t\t\t\talert('ID를 입력하세요.');\n");
      out.write("\t\t\t\tdocument.getElementById('login-form').userid.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}else if(this.password === \"\"){\n");
      out.write("\t\t\t\talert('PW를 입력하세요.');\n");
      out.write("\t\t\t\tdocument.getElementById('login-form').password.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\treturn true;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tthis.overlabValidation = function(){\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t\tthis.joinValidation = function(){\n");
      out.write("\t\t\tif(this.memberId === \"\"){\n");
      out.write("\t\t\t\talert('ID를 입력하세요.');\n");
      out.write("\t\t\t\tdocument.getElementById('join-form').userid.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}else if(this.overlabValidation){\n");
      out.write("\t\t\t\t//alert('중복된 ID입니다.');\n");
      out.write("\t\t\t\t//return false;\n");
      out.write("\t\t\t}else if(this.password === \"\"){\n");
      out.write("\t\t\t\talert('PW를 입력하세요.');\n");
      out.write("\t\t\t\tdocument.getElementById('join-form').password.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}else if(this.name === \"\"){\n");
      out.write("\t\t\t\talert('이름을 입력하세요.');\n");
      out.write("\t\t\t\tdocument.getElementById('join-form').username.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}else if(this.ssn === \"\"){\n");
      out.write("\t\t\t\talert('생년월일을 입력하세요.');\n");
      out.write("\t\t\t\tdocument.getElementById('join-form').userssn.focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}else{}\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("</script> -->\n");
      out.write("\n");
      out.write("<!-- <script>\n");
      out.write("\tfunction Common(){\n");
      out.write("\t\tthis.move = function (domain, action, page){\n");
      out.write("\t\t\tlocation.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\"+domain+\".do?action=\"+action+\"&page=\"+page;\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\tfunction Member(){\n");
      out.write("\t/* this.memberId, teamId, name, ssn, roll, password; */\n");
      out.write("\tthis.loginValidation = function(){return \"Validation Check\";}\n");
      out.write("\t/* this.loginValidation = loginValidation; 은 서로 이름이 같으며 function을 주고있으니 = function(){} 을 줄 수있다. */\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tvar member = new Member();\n");
      out.write("\t// new Member() 를 new (function(){}) 의 형태로 줄 수 있다. anonymous function\n");
      out.write("\tvar loginValidation = function(){\n");
      out.write("\tvar loginValidation = function loginValidation(){} 은 서로 이름이 같아 var loginValidation = function(){}이 될 수 있다.\n");
      out.write("\treturn ;\n");
      out.write("\t프로시저는 값을 반환할 수 없다(== setter). 함수를 만들려면 return문이 있어야한다(== getter).\n");
      out.write("} \n");
      out.write("</script> -->\n");
      out.write("\n");
      out.write("<!-- <script>\n");
      out.write("function move(domain, action, page){\n");
      out.write("\t//alert(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\"+domain+\".do?action=\"+action+\"&page=\"+page\");\n");
      out.write("\t//java의 sysout과 같음\n");
      out.write("\tlocation.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\"+domain+\".do?action=\"+action+\"&page=\"+page;\n");
      out.write("\t//href 는 a tag에서 속성값이었다. location은 객체로 볼 수 있다.\n");
      out.write("}\n");
      out.write("function sendForm(){\n");
      out.write("\treturn true;\n");
      out.write("}\n");
      out.write("</script> -->");
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
