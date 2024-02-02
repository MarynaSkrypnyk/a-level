import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int result = 0;
        try {
            String number1 = req.getParameter("n1");
            String number2 = req.getParameter("n2");
            String operator = req.getParameter("op");
            int x = Integer.parseInt(number1);
            int y = Integer.parseInt(number2);
            if (operator.equals("add")) {
                result = x + y;
            } else if (operator.equals("delete")) {
                result = x - y;
            } else if (operator.equals("multiply")) {
                result = x * y;
            } else if (operator.equals("divide")) {
                result = x / y;
            }
            PrintWriter p = resp.getWriter();
            p.println(result);

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
