package de.spqrinfo.bookstore.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = "NAME"),
        @UniqueConstraint(columnNames = "SYMBOL")
})
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 32, nullable = false)
    private String name;

    @Column(nullable = false)
    private char symbol;

    @NotNull
    @OneToOne(optional = false)
    @JoinTable(name = "COUNTRY_CURRENCY", joinColumns = @JoinColumn(name = "CURRENCY_ID"),
            inverseJoinColumns = @JoinColumn(name = "COUNTRY_ID"))
    private Country country;

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

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(final char symbol) {
        this.symbol = symbol;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(final Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", symbol=" + symbol +
                ", country=" + country +
                '}';
    }
}
