package com.tobeto.pair7Demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="customers")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    @OneToMany (mappedBy = "customer")
    private List<Payment> payments;

    @OneToOne(mappedBy = "customer")
    private User user;
}
