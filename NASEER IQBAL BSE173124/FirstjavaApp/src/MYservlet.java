import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by bse173124 on 10/8/2020.
 */
@WebServlet(name = "MYservlet")
public class MYservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

              String data = request.getParameter("Username");
        System.out.println(data);
        String data1 = request.getParameter("password");
        System.out.println(data1);
        String data2 = request.getParameter("firstname");
        System.out.println(data2);


        String data3 = request.getParameter("lastname");
        System.out.println(data3);

        String data4 = request.getParameter("dob");
        System.out.println(data4);


        String data5 = request.getParameter("email");
        System.out.println(data5);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Lab Task";
        out.println("<HTML>");
        out.println("<BODY><H1>The Recieved Data</H1>");


        out.println("<TR><TD>dbi</TD><TD>Data: "+data+"</TD></TR>");

        out.println("<TR><TD>dbi</TD><TD>Data: "+data1+"</TD></TR>");

        out.println("<TR><TD>dbi</TD><TD>Data: "+data2+"</TD></TR>");


        out.println("<TR><TD>dbi</TD><TD>Data: "+data3+"</TD></TR>");
        out.println("<TR><TD>dbi</TD><TD>Data: "+data4+"</TD></TR>");

        out.println("<TR><TD>dbi</TD><TD>Data: "+data5+"</TD></TR>");


        out.println("</TABLE></BODY></HTML>");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
