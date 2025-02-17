package com.example.glowtique.payment.model;

import com.example.glowtique.order.model.Order;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    private Order order;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    private String transactionId;
    private String paymentMethod;

}
