package de.spqrinfo.bookstore.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = "NAME"),
        @UniqueConstraint(columnNames = "ISO3CODE")
})
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 128, nullable = false)
    private String name;

    @Size(min = 3, max = 3)
    @Column(length = 3, nullable = false)
    private String iso3Code;

    @OneToOne(mappedBy = "country", optional = false)
    private Currency currency;

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

    public String getIso3Code() {
        return iso3Code;
    }

    public void setIso3Code(final String iso3Code) {
        this.iso3Code = iso3Code;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", iso3Code='" + iso3Code + '\'' +
                '}';
    }
}
