package de.spqrinfo.bookstore.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class BookImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private BookImageType bookImageType;

    @NotNull
    @Column(length = 256)
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
