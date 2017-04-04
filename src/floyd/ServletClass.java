package floyd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletClass extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		super.doGet(request,response);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String title="Reading Three Request Parameters";
		String docType="<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0"+"Transitional//EN\">\n";
		out.println(docType+"<html>\n"+
							"<head><title>"+title+"</title></head>\n"+
							"<body bgcolor=\"#FDF5F6\">\n"+
							"<h1 align=\"center\">"+title+"</h1>\n"+
							"<ul>\n"+
							"	<li><b>param1</b>£º"+request.getParameter("param1")+"</li>"+
							"	<li><b>param2</b>£º"+request.getParameter("param2")+"</li>"+
							"	<li><b>param3</b>£º"+request.getParameter("param3")+"</li>"+
							"</ul>\n"+
							"</body></html>");
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		super.doPost(request, response);
		doGet(request,response);
	}
}