package pl;

import model.Author;
import repository.AuthorRepository;

import java.util.List;

public class AuthorService  {
    private final AuthorRepository authorRepository;
    private static AuthorService authorService;

    public AuthorService(){
        authorRepository = AuthorRepository.getInstance();
    }

    public static AuthorService getInstance(){
        if(authorService == null){
            authorService = new AuthorService();
        }
        return authorService;
    }

    public List<Author> getAuthorList(){
        return authorRepository.getEntityList();
    }

    public void add(Author author){
        authorRepository.create(author);
    }

}
