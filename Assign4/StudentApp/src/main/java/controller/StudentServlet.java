package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.StudentBean;
import model.StudentDAO;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=UTF-8");
        try {
            // 🔹 1. Get data from form
            int rollNo = Integer.parseInt(request.getParameter("rollNo"));
            int marks = Integer.parseInt(request.getParameter("marks"));

            // 🔹 2. Fetch student from DB
            StudentBean student = StudentDAO.getStudent(rollNo);

            // 🔥 3. Check if student exists
            if (student.getName() == null) {
                response.setContentType("text/html");
                response.getWriter().println("<h3>Student not found ❌</h3>");
                return;
            }

            // 🔹 4. Set marks
            student.setMarks(marks);

            // 🔹 5. Calculate percentage (MODEL logic)
            student.calculate();

            // 🔹 6. Update DB
            StudentDAO.updateStudent(student);

            // 🔹 7. Send to JSP
            request.setAttribute("student", student);

            RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
