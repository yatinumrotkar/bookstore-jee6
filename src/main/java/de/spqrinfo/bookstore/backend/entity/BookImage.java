package de.spqrinfo.bookstore.backend.entity;

import javax.persistence.*;

@Entity(name = "BOOK_IMAGE")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "filename"))
public class BookImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private BookImageType bookImageType;

    @Column(length = 256, nullable = false)
    private String filename;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public BookImageType getBookImageType() {
        return bookImageType;
    }

    public void setBookImageType(final BookImageType bookImageType) {
        this.bookImageType = bookImageType;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(final String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return "BookImage{" +
                "id=" + id +
                ", bookImageType=" + bookImageType +
                ", filename='" + filename + '\'' +
                '}';
    }
}
