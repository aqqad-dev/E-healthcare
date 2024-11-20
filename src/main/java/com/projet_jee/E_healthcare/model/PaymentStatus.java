package com.projet_jee.E_healthcare.model;

public enum PaymentStatus {
    PENDING,       // Payment has not yet been made
    PAID,          // Payment has been completed
    PARTIALLY_PAID, // Only part of the amount has been paid
    OVERDUE,       // Payment is past the due date
    CANCELLED,     // Payment was cancelled
    REFUNDED,      // Payment has been refunded
    FAILED;
}
