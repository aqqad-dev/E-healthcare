package com.projet_jee.E_healthcare.dto;

import com.projet_jee.E_healthcare.model.PaymentStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class BillDto {
    private Integer id;
    private BigDecimal amount;
    private PaymentStatus payment_status;
    public LocalDate date_issued;
    public LocalDate due_date;
}
