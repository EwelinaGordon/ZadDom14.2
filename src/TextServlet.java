import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/TextServlet")
public class TextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        String text = request.getParameter("text");
        PrintWriter writer = response.getWriter();

        String[] textTab = text.split(" ");
        String textWithoutsWhiteSigns = text.replace(" ", "");

        writer.println("<html><body>");
        writer.println(text);
        writer.println("<h1>");
        writer.println("Ilość słów: " + textTab.length);
        writer.println("<br>");
        writer.println("Ilość znaków: " + text.length());
        writer.println("<br>");
        writer.println("Ilość znaków (bez spacji): " + textWithoutsWhiteSigns.length());
        writer.println("<br>");
        writer.println("Palindrom: " + isPalindrome(textTab));
        writer.println("</h1></body></html>");
    }

    public boolean isPalindrome(String[] text) {
        int length = text.length;
        for (int i = 0; i < text.length; i++) {
            String orginal = text[i];
            String reversed = text[--length];
            if (length < i) {
                return true;
            }
            if (orginal != reversed) {
                return false;
            }
        }
        return true;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Ten servlet nie obsługuje metody doGet");
    }
}
