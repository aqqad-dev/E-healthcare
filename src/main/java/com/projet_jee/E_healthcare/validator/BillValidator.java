package com.projet_jee.E_healthcare.validator;

import com.projet_jee.E_healthcare.dto.BillDto;
import com.projet_jee.E_healthcare.model.Bill;

import java.util.ArrayList;
import java.util.List;

public class BillValidator {
    public static List<String> validate(BillDto billDto) {
        List<String> errors = new ArrayList<>();
        if (billDto == null) {
            errors.add("Amount cannot be null");
            errors.add("Date issued cannot be null");
            errors.add("Due date cannot be null");
            return errors;
        }
        if (billDto.getAmount() == null){
            errors.add("Amount cannot be null");
        }
        if (billDto.getDate_issued() == null){
            errors.add("Date issued cannot be null");
        }
        if (billDto.getDue_date() == null){
            errors.add("Due date cannot be null");
        }
        return errors;
    }

}
