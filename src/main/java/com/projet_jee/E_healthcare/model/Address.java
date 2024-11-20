package com.projet_jee.E_healthcare.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Address {
    @Column(name = "address1")
    private String address_line1;
    @Column(name = "address2")
    private String address_line2;
    @Column(name = "city")
    private String city;
    @Column(name = "postalcode")
    private String postal_code;
    @Column(name = "country")
    private String country;
}
