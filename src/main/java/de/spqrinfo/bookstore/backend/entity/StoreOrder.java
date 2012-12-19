package de.spqrinfo.bookstore.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class StoreOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @NotNull
    @ManyToOne(optional = false)
    private Customer customer;

    @NotNull
    @Column(name = "CUSTOMER_ADDRESS_ID", nullable = false)
    @OneToOne(optional = false)
    private CustomerAddress customerAddress;

    @Column(name = "STORE_ORDER_STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private StoreOrderStatus storeOrderStatus;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(final Date created) {
        this.created = created;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(final CustomerAddress customerAddress) {
        this.customerAddress = customerAddress;
    }

    public StoreOrderStatus getStoreOrderStatus() {
        return storeOrderStatus;
    }

    public void setStoreOrderStatus(final StoreOrderStatus storeOrderStatus) {
        this.storeOrderStatus = storeOrderStatus;
    }

    @Override
    public String toString() {
        return "StoreOrder{" +
                "id=" + id +
                ", created=" + created +
                ", customer=" + customer +
                ", customerAddress=" + customerAddress +
                ", storeOrderStatus=" + storeOrderStatus +
                '}';
    }
}
