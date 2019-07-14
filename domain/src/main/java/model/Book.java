package model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    @Column(name = "boorow")
    private boolean borrow;

    @Column(name = "category")
    private String category;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "pages")
    private int pages;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "summary")
    private String summary;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
/*
    @OneToMany(mappedBy = "borrowerList")
    @JoinColumn(name = "borrow_id")
    private List<Borrow> borrowList;*/
}
