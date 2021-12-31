package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formServlet
 */
@WebServlet(name = "formServlet", urlPatterns = {"aaa"})
public class formServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public formServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("big5");
		String val1 = request.getParameter("user");
		String val2 = request.getParameter("msg");
		response.setContentType("text/html;charset=big5");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Sample01</title></head></body>");
		out.println(val1+"»¡:¡u"+val2+ "¡v ¡C");
		out.println("</body></html>");
		out.close();
	}

}
