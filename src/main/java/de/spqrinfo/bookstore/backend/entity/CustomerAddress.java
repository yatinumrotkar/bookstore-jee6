package de.spqrinfo.bookstore.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "CUSTOMER_ADDRESS")
public class CustomerAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @ManyToOne(optional = false)
    private Customer customer;

    @Column(length = 256, nullable = false)
    private String street;

    @Column(length = 16, nullable = false)
    private String zip;

    @NotNull
    @ManyToOne(optional = false)
    private Country country;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(final String zip) {
        this.zip = zip;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(final Country country) {
        this.country = country;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(final Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "CustomerAddress{" +
                "id=" + id +
                ", customer=" + customer +
                ", street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                ", country=" + country +
                ", created=" + created +
                '}';
    }
}
