package servlets;

import model.Author;
import model.Book;
import pl.AuthorService;
import pl.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/EditBookServlet")
public class EditBookServlet extends HttpServlet {
    private final BookService bookService;

    public EditBookServlet() {
        this.bookService = BookService.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookId = request.getParameter("bookId");

        Book book = bookService.findBookById(Long.valueOf(bookId));
        BookDetails(book, request);
        bookService.update(book);
        response.sendRedirect("HomeServlet");
    }

    static void BookDetails(Book book, HttpServletRequest request) {
        Author author = new Author();
        author.setFirstName(request.getParameter("firstName"));
        author.setLastName(request.getParameter("lastName"));
        author.setBirthPlace("Krakow");
        AuthorService.getInstance().add(author);

        book.setAuthor(author);
        book.setIsbn(request.getParameter("isbn"));
        book.setPages(Integer.valueOf(request.getParameter("pages")));
        book.setReleaseDate(LocalDate.parse(request.getParameter("release")));
        book.setTitle(request.getParameter("title"));
        book.setCategory(request.getParameter("category"));
        book.setSummary(request.getParameter("summary"));
        if(book.getAuthor() != null && book.getCategory() != null){
            BookService.getInstance().addBook(book);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
