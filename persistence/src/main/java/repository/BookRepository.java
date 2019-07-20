package repository;

import model.Book;

import javax.persistence.EntityManager;

public class BookRepository extends GenericRepository<Book,Long> {
   private static BookRepository bookRepository;

   private BookRepository(){}

   public static BookRepository getInstance(){
       if(bookRepository == null){
           bookRepository = new BookRepository();
       }

       return bookRepository;
   }
}
