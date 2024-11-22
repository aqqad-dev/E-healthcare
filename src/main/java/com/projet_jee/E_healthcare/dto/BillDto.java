package com.projet_jee.E_healthcare.dto;

import com.projet_jee.E_healthcare.model.PaymentStatus;

import java.time.LocalDate;

public class BillDto {
    private Integer id;
    private double amount;
    private PaymentStatus payment_status;
    public LocalDate date_issued;
    public LocalDate due_date;
}
