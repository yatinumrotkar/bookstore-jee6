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

    @Column(length = 256, nullable = false)
    private String name;

    @Column(length = 13, nullable = false)
    private String isbn13;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date publication;

    @Column(nullable = false)
    private boolean enabled = true;

    @NotNull
    @ManyToMany
    @JoinTable(name = "BOOK_AUTHOR", joinColumns = @JoinColumn(name = "BOOK_ID"),
            inverseJoinColumns = @JoinColumn(name = "AUTHOR_ID"))
    private List<Author> authors;

    @NotNull
    @ManyToMany
    @JoinTable(name = "BOOK_CATEGORY", joinColumns = @JoinColumn(name = "BOOK_ID"),
            inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID"))
    private List<Category> categories;

    @NotNull
    @OneToMany(mappedBy = "book")
    private List<Price> prices;

    @NotNull
    @OneToMany
    private List<BookImage> bookImages;

    public void addAuthor(final Author author) {
        this.authors.add(author);
    }

    public void addBookImage(final BookImage bookImage) {
        this.bookImages.add(bookImage);
    }

    // --- Generated methods

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(final String isbn13) {
        this.isbn13 = isbn13;
    }

    public Date getPublication() {
        return publication;
    }

    public void setPublication(final Date publication) {
        this.publication = publication;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(final List<Author> authors) {
        this.authors = authors;
    }

    public List<BookImage> getBookImages() {
        return bookImages;
    }

    public void setBookImages(final List<BookImage> images) {
        this.bookImages = images;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isbn13='" + isbn13 + '\'' +
                ", publication=" + publication +
                ", enabled=" + enabled +
                ", authors=" + authors +
                ", images=" + bookImages +
                '}';
    }
}
