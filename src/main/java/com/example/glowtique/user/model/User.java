package com.example.glowtique.user.model;

import com.example.glowtique.cart.model.Cart;
import com.example.glowtique.order.model.Order;
import com.example.glowtique.wishlistItem.model.WishlistItem;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private UserGender gender;

    private LocalDate birthday;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    private String town;

    private String street;

    @Enumerated(EnumType.STRING)
    private Country country;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private Set<Order> orders = new HashSet<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<WishlistItem> wishlistItems = new HashSet<>();

    @OneToOne(fetch = FetchType.LAZY)
    private Cart cart;

}
