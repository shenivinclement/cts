package org.example;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final Map<String, Loan> loanStore = new HashMap<>();

    public LoanController() {
        loanStore.put("C001", new Loan("C001", "LN5001", "Home Loan", 2500000.0));
        loanStore.put("C002", new Loan("C002", "LN5002", "Car Loan", 800000.0));
    }

    @GetMapping("/{customerId}")
    public Loan getLoan(@PathVariable String customerId) {
        Loan loan = loanStore.get(customerId);
        if (loan == null) {
            throw new RuntimeException("Loan not found for customer: " + customerId);
        }
        return loan;
    }
}