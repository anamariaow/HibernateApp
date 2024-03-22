package com.example.eserciziohibernate.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order extends BaseEntityData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDateTime checkoutDate;
    @ManyToOne(fetch = FetchType.LAZY) //select all from orders, con solo id user non tutta la lista di user
    //gli diciamo di non fetchare subito user perché non serve, nel caso lo chiederò nella query (a differenza di FetchType.EAGER)
    private User user;
    @ManyToMany
    private List<Product> productList;
}
