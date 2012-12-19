package de.spqrinfo.bookstore.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity(name = "STORE_ORDER_POSITION")
public class StoreOrderPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "STORE_ORDER_ID", nullable = false)
    @ManyToOne(optional = false)
    private StoreOrder storeOrder;

    @NotNull
    @ManyToOne(optional = false)
    private Book book;

    @NotNull
    @ManyToOne(optional = false)
    private Price price;

    @Min(0)
    @Column(nullable = false)
    private int amount;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public StoreOrder getStoreOrder() {
        return storeOrder;
    }

    public void setStoreOrder(final StoreOrder storeOrder) {
        this.storeOrder = storeOrder;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(final Book book) {
        this.book = book;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(final Price price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(final int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "StoreOrderPosition{" +
                "id=" + id +
                ", storeOrder=" + storeOrder +
                ", book=" + book +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
