package Floyd0404;
//import required java libraries
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.GregorianCalendar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletClass
 */
@WebServlet("/ServletClass")
public class ServletClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 * 执行时期：当servlet实力被创建的时候被调用。
	 * Servlet Config配置
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		PrintWriter printWriter=response.getWriter();
////		printWriter.println("<html><body><h1>asdf</h1></body></html>");
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	Method to handle GET method request.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		set refresh,auto load time as 5 seconds
		response.setIntHeader("Refresh",5);
//		set response content type
		response.setContentType("text/html");
//		get current time
		Calendar calendar=new GregorianCalendar();
		String am_pmString;
		int hourInt=calendar.get(Calendar.HOUR);
		int minuteInt=calendar.get(Calendar.MINUTE);
		int secondInt=calendar.getMaximum(Calendar.SECOND);
		if(calendar.get(Calendar.AM_PM)==0){
			am_pmString="AM";
		}else{
			am_pmString="PM";
		}
		String CT=hourInt+":"+minuteInt+":"+secondInt+" "+am_pmString;
		PrintWriter printWriter=response.getWriter();
		String title="Auto Refresh Header Setting";
		String docType="<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
		printWriter.println(docType+
				"<html>\n"+
				"<head>\n"+
					"<title>"+title+"</title>\n"+
				"</head>\n"+
				"<body bgcolor=\"#f0f0f0\">\n"+
					"<h1 align=\"center\">"+title+"</h1>\n"+
					"<p>Current Time is:"+CT+"</p>\n"+
				"</body>\n"+
				"</html>\n");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	method to handle Post method request.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
//		set response content type
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		String title="Using POST Method to Read Form Data";
		String docType="<!DOCTYPE HTML PUBLIC\"-//w3c//dtd html 4.0 "+"transitional//en\">\n";
		printWriter.println(docType+"<html>\n"+
				"<head><title>"+title+"</title></head>"+
				"<body bgcolor=\"#f0f0f0\">\n"+
					"<h1 align=\"center\">"+title+"</h1>\n"+
					"<ul>\n"+
						"<li><b>Maths Flag:</b>:"+request.getParameter("maths")+"</li>\n"+
						"<li><b>Physics Flag:</b>:"+request.getParameter("physics")+"</li>\n"+
						"<li><b>Chemistry Flag:</b>:"+request.getParameter("chemistry")+"</li>\n"+
					"</ul>\n"+
				"</body>"+
		"</html>"
				);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doHead(HttpServletRequest, HttpServletResponse)
	 */
	protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doOptions(HttpServletRequest, HttpServletResponse)
	 */
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doTrace(HttpServletRequest, HttpServletResponse)
	 */
	protected void doTrace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
