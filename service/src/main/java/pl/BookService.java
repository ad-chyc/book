package pl;

import model.Book;
import repository.BookRepository;

import java.util.List;

public class BookService {
    private final BookRepository bookRepository;
    private static BookService bookService;

    private BookService(){
        bookRepository = BookRepository.getInstance();
    }

    public static BookService getInstance() {
        if(bookService == null) {
            bookService = new BookService();
        }
        return bookService;
    }

    public List<Book> bookList(){
        return bookRepository.getEntityList();
    }

    public void addBook(Book book){
        bookRepository.create(book);
    }

    public void delete(Book book){
        bookRepository.delete(book);
    }

    public Book findBookById(Long id){
        return bookRepository.read(id);
    }

    public void update(Book book){
        bookRepository.update(book);
    }
}
