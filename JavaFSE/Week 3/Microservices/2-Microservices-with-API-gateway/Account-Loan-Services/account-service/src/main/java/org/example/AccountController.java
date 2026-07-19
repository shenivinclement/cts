package org.example;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final Map<String, Account> accountStore = new HashMap<>();

    public AccountController() {
        accountStore.put("C001", new Account("C001", "AC1001", "Savings", 25000.0));
        accountStore.put("C002", new Account("C002", "AC1002", "Current", 87000.0));
    }

    @GetMapping("/{customerId}")
    public Account getAccount(@PathVariable String customerId) {
        Account account = accountStore.get(customerId);
        if (account == null) {
            throw new RuntimeException("Account not found for customer: " + customerId);
        }
        return account;
    }
}