package de.spqrinfo.bookstore.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"NAME", "SURNAME"}),
        @UniqueConstraint(columnNames = "EMAIL")
})
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 32, nullable = false)
    private String name;

    @Column(length = 32, nullable = false)
    private String surname;

    @Column(nullable = false)
    private boolean locked = false;

    @Column(length = 64, nullable = false)
    private String email;

    @Column(name = "CRYPTED_PASSWORD", length = 256, nullable = false)
    private String cryptedPassword;

    @NotNull
    @OneToMany(mappedBy = "customer")
    private List<CustomerAddress> addresses;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(final boolean locked) {
        this.locked = locked;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getCryptedPassword() {
        return cryptedPassword;
    }

    public void setCryptedPassword(final String cryptedPassword) {
        this.cryptedPassword = cryptedPassword;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", locked=" + locked +
                ", email='" + email + '\'' +
                ", cryptedPassword='" + cryptedPassword + '\'' +
                '}';
    }
}
