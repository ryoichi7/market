package ryo.market.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @NotNull(message = "Order should have customer dependency!")
    private Customers customer;


}
