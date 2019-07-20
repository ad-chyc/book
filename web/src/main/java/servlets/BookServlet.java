package servlets;

import model.Author;
import model.Book;
import pl.AuthorService;
import pl.BookService;
import repository.BookRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long bookId = Long.valueOf(req.getParameter("bookId"));
        String action = req.getParameter("action");
        req.setAttribute("book",BookService.getInstance().findBookById(bookId));

        switch (action){
            case "ADD":
                req.getRequestDispatcher("addBook.jsp").forward(req,resp);
                break;
            case "EDIT":
                req.getRequestDispatcher("book.jsp").forward(req,resp);
                break;
            case "SHOW":
                req.getRequestDispatcher("showBook.jsp").forward(req,resp);
                break;
            case "DELETE":
                req.getRequestDispatcher("DeleteBookServlet").forward(req, resp);
                break;
            default:
                resp.sendRedirect("HomeServlet");
                break;
        }
    }
}
