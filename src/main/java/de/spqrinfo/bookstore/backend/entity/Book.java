package de.spqrinfo.bookstore.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(length = 256)
    private String name;

    @NotNull
    @Column(length = 13)
    private String isbn13;

    @NotNull
    private Date publication;

    @NotNull
    private boolean enabled = true;

    @ManyToMany
    @JoinTable(name = "book_author", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;
}
