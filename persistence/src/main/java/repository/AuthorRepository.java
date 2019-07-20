package repository;

import model.Author;

public class AuthorRepository extends GenericRepository<Author, Long> {

    private static AuthorRepository authorRepository;

    private AuthorRepository(){

    }

    public static AuthorRepository getInstance(){
       if(authorRepository == null){
           authorRepository = new AuthorRepository();
       }
       return authorRepository;
    }
}
