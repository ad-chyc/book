package repository;

import model.Book;

import javax.persistence.EntityManager;

public class BookRepository extends GenericRepository<Book,Long> {
    protected BookRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
